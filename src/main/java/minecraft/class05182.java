package minecraft;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public abstract class class05182<K, V extends class05151<K>> {
   private static final Logger y = LogUtils.getLogger();
   private static final Gson L = new GsonBuilder().setPrettyPrinting().create();
   private final File u;
   private final Map<String, V> i = Maps.newHashMap();
   protected final class06633 N;

   public File L() {
      return this.u;
   }

   @Nullable
   public V L(K var1) {
      this.B();
      return this.i.get(this.y((K)var1));
   }

   public void M() throws IOException {
      if (this.u.exists()) {
         try (BufferedReader bufferedreader = Files.newReader(this.u, StandardCharsets.UTF_8)) {
            this.i.clear();
            JsonArray jsonarray = (JsonArray)L.fromJson(bufferedreader, JsonArray.class);
            if (jsonarray == null) {
               return;
            }

            Iterator<JsonElement> iterator = jsonarray.iterator();

            while (iterator.hasNext()) {
               JsonObject jsonobject = class05001.W(iterator.next(), "entry");
               class05151 class05151 = this.N(jsonobject);
               if (class05151.B() != null) {
                  this.i.put(this.y((K)class05151.B()), (V)class05151);
               }
            }
         }
      }
   }

   public class05182(File var1, class06633 var2) {
      super();
      this.u = var1;
      this.N = var2;
   }

   private void B() {
      ArrayList arraylist = Lists.newArrayList();

      for (class05151 class05151 : this.i.values()) {
         if (class05151.M()) {
            arraylist.add(class05151.B());
         }
      }

      for (Object object : arraylist) {
         this.i.remove(this.y((K)object));
      }
   }

   public Collection<V> i() {
      return this.i.values();
   }

   protected boolean u(K var1) {
      return this.i.containsKey(this.y((K)var1));
   }

   public boolean u() {
      return this.i.isEmpty();
   }

   protected String y(K var1) {
      return var1.toString();
   }

   public String[] y() {
      return this.i.keySet().toArray(new String[0]);
   }

   public boolean y(class05151<K> var1) {
      return this.N(Objects.requireNonNull((K)var1.B()));
   }

   public boolean N(K var1) {
      if (this.i.remove(this.y((K)var1)) == null) {
         return false;
      } else {
         try {
            this.R();
         } catch (IOException ioexception) {
            y.warn("Could not save the list after removing a user.", ioexception);
         }

         return true;
      }
   }

   public boolean N(V var1) {
      String s = this.y((K)var1.B());
      class05151 class05151 = this.i.get(s);
      if (var1.equals(class05151)) {
         return false;
      } else {
         this.i.put(s, (V)var1);

         try {
            this.R();
         } catch (IOException ioexception) {
            y.warn("Could not save the list after adding a user.", ioexception);
         }

         return true;
      }
   }

   public void N() {
      this.i.clear();

      try {
         this.R();
      } catch (IOException ioexception) {
         y.warn("Could not save the list after removing a user.", ioexception);
      }
   }

   protected abstract class05151<K> N(JsonObject var1);

   public void R() throws IOException {
      JsonArray jsonarray = new JsonArray();
      this.i.values().stream().map(var0 -> class07536.N(new JsonObject(), var0::N)).forEach(jsonarray::add);

      try (BufferedWriter bufferedwriter = Files.newWriter(this.u, StandardCharsets.UTF_8)) {
         L.toJson(jsonarray, L.newJsonWriter(bufferedwriter));
      }
   }
}
