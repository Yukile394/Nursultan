package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class class01053 implements class08957 {
   private static final Logger N = LogUtils.getLogger();
   private static final int y = 1000;
   private static final int L = 1;
   private boolean u = true;
   private final Map<String, class01084> i = new ConcurrentHashMap<>();
   private final Map<UUID, class01084> R = new ConcurrentHashMap<>();
   private final GameProfileRepository M;
   private final Gson B = new GsonBuilder().create();
   private final File Z;
   private final AtomicLong z = new AtomicLong();

   private static DateFormat L() {
      return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z", Locale.ROOT);
   }

   public class01053(GameProfileRepository var1, File var2) {
      super();
      this.M = var1;
      this.Z = var2;
      Lists.reverse(this.u()).forEach(this::N);
   }

   private List<class01084> u() {
      ArrayList arraylist = Lists.newArrayList();

      try {
         ArrayList arraylist1;
         try (BufferedReader bufferedreader = Files.newReader(this.Z, StandardCharsets.UTF_8)) {
            JsonArray jsonarray = (JsonArray)this.B.fromJson(bufferedreader, JsonArray.class);
            if (jsonarray != null) {
               DateFormat dateformat = L();
               jsonarray.forEach(var2x -> N(var2x, dateformat).ifPresent(arraylist::add));
               return arraylist;
            }

            arraylist1 = arraylist;
         }

         return arraylist1;
      } catch (FileNotFoundException filenotfoundexception) {
      } catch (JsonParseException | IOException ioexception) {
         N.warn("Failed to load profile cache {}", this.Z, ioexception);
      }

      return arraylist;
   }

   private class01084 y(class08774 var1) {
      Calendar calendar = Calendar.getInstance(TimeZone.getDefault(), Locale.ROOT);
      calendar.setTime(new Date());
      calendar.add(2, 1);
      Date date = calendar.getTime();
      class01084 class01084 = new class01084(var1, date);
      this.N(class01084);
      this.N();
      return class01084;
   }

   private long y() {
      return this.z.incrementAndGet();
   }

   private Optional<class08774> y(String var1) {
      return this.u ? Optional.of(class08774.N(var1)) : Optional.empty();
   }

   private Stream<class01084> N(int var1) {
      return ImmutableList.copyOf(this.R.values()).stream().sorted(Comparator.comparing(class01084::L).reversed()).limit(var1);
   }

   private static JsonElement N(class01084 var0, DateFormat var1) {
      JsonObject jsonobject = new JsonObject();
      var0.N().y(jsonobject);
      jsonobject.addProperty("expiresOn", var1.format(var0.y()));
      return jsonobject;
   }

   private static Optional<class01084> N(JsonElement var0, DateFormat var1) {
      if (var0.isJsonObject()) {
         JsonObject jsonobject = var0.getAsJsonObject();
         class08774 class08774 = class08774.N(jsonobject);
         if (class08774 != null) {
            JsonElement jsonelement = jsonobject.get("expiresOn");
            if (jsonelement != null) {
               String s = jsonelement.getAsString();

               try {
                  Date date = var1.parse(s);
                  return Optional.of(new class01084(class08774, date));
               } catch (ParseException parseexception) {
                  N.warn("Failed to parse date {}", s, parseexception);
               }
            }
         }
      }

      return Optional.empty();
   }

   @Override
   public Optional<class08774> N(UUID var1) {
      class01084 class01084 = this.R.get(var1);
      if (class01084 == null) {
         return Optional.empty();
      } else {
         class01084.N(this.y());
         return Optional.of(class01084.N());
      }
   }

   @Override
   public void N(class08774 var1) {
      this.y(var1);
   }

   @Override
   public Optional<class08774> N(String var1) {
      String s = var1.toLowerCase(Locale.ROOT);
      class01084 class01084 = this.i.get(s);
      boolean flag = false;
      if (class01084 != null && new Date().getTime() >= class01084.N.getTime()) {
         this.R.remove(class01084.N().N());
         this.i.remove(class01084.N().y().toLowerCase(Locale.ROOT));
         flag = true;
         class01084 = null;
      }

      Optional optional;
      if (class01084 != null) {
         class01084.N(this.y());
         optional = Optional.of(class01084.N());
      } else {
         Optional<class08774> optional1 = this.N(this.M, s);
         if (optional1.isPresent()) {
            optional = Optional.of(this.y(optional1.get()).N());
            flag = false;
         } else {
            optional = Optional.empty();
         }
      }

      if (flag) {
         this.N();
      }

      return optional;
   }

   private Optional<class08774> N(GameProfileRepository var1, String var2) {
      if (!class05018.R(var2)) {
         return this.y(var2);
      } else {
         Optional optional = var1.findProfileByName(var2).map(class08774::new);
         return optional.isEmpty() ? this.y(var2) : optional;
      }
   }

   private void N(class01084 var1) {
      class08774 class08774 = var1.N();
      var1.N(this.y());
      this.i.put(class08774.y().toLowerCase(Locale.ROOT), var1);
      this.R.put(class08774.N(), var1);
   }

   @Override
   public void N(boolean var1) {
      this.u = var1;
   }

   @Override
   public void N() {
      JsonArray jsonarray = new JsonArray();
      DateFormat dateformat = L();
      this.N(1000).forEach(var2x -> jsonarray.add(N(var2x, dateformat)));
      String s = this.B.toJson(jsonarray);

      try (BufferedWriter bufferedwriter = Files.newWriter(this.Z, StandardCharsets.UTF_8)) {
         bufferedwriter.write(s);
      } catch (IOException ioexception) {
      }
   }
}
