package minecraft;

import Nursultan.class10459;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;

public class class04606 extends class05096 {
   private static final class01894 N = class01894.y("textures/misc/credits_vignette.png");
   private static final Logger y = LogUtils.getLogger();
   private static final class00392 L = class00392.y("============").N(class06541.field_1068);
   private static final String u = "           ";
   private static final String i = "" + class06541.field_1068 + class06541.field_1051 + class06541.field_1060 + class06541.field_1075;
   private static final float R = 5.0F;
   private static final float M = 15.0F;
   private static final class01894 B = class01894.y("texts/end.txt");
   private static final class01894 Z = class01894.y("texts/credits.json");
   private static final class01894 z = class01894.y("texts/postcredits.txt");
   private final boolean U;
   private final Runnable E;
   private float W;
   private List<class01028> m;
   private List<class00392> P;
   private IntSet s;
   private int T;
   private boolean b;
   private final IntSet j = new IntOpenHashSet();
   private float v;
   private final float n;
   private int t;
   private final class02088 G = new class02088(false);

   private void L() {
      this.m.add(class01028.N);
      this.P.add(class05220.N);
   }

   public class04606(boolean var1, Runnable var2) {
      super(class05153.N);
      this.U = var1;
      this.E = var2;
      if (!var1) {
         this.n = 0.75F;
      } else {
         this.n = 0.5F;
      }

      this.t = 1;
      this.v = this.n;
   }

   private void y(Reader var1) {
      Iterator<JsonElement> iterator = class05001.y(var1).iterator();

      while (iterator.hasNext()) {
         JsonObject jsonobject = iterator.next().getAsJsonObject();
         String sx = jsonobject.get("section").getAsString();
         this.N(L, true, false);
         this.N(class00392.y(sx).N(class06541.field_1054), true, true);
         this.N(L, true, false);
         this.L();
         this.L();
         Iterator<JsonElement> iterator1 = jsonobject.getAsJsonArray("disciplines").iterator();

         while (iterator1.hasNext()) {
            JsonObject jsonobject1 = iterator1.next().getAsJsonObject();
            String s1 = jsonobject1.get("discipline").getAsString();
            if (StringUtils.isNotEmpty(s1)) {
               this.N(class00392.y(s1).N(class06541.field_1054), true, true);
               this.L();
               this.L();
            }

            Iterator<JsonElement> iterator2 = jsonobject1.getAsJsonArray("titles").iterator();

            while (iterator2.hasNext()) {
               JsonObject jsonobject2 = iterator2.next().getAsJsonObject();
               String s2 = jsonobject2.get("title").getAsString();
               JsonArray jsonarray = jsonobject2.getAsJsonArray("names");
               this.N(class00392.y(s2).N(class06541.field_1080), false, true);
               Iterator<JsonElement> iterator3 = jsonarray.iterator();

               while (iterator3.hasNext()) {
                  String s3 = iterator3.next().getAsString();
                  this.N(class00392.y("           ").i(s3).N(class06541.field_1068), false, true);
               }

               this.L();
               this.L();
            }
         }
      }
   }

   private void y() {
      this.E.run();
   }

   private void N(Reader var1) throws IOException {
      BufferedReader bufferedreader = new BufferedReader(var1);
      class06069 class06069 = class06069.y(8124371L);

      String sx;
      while ((sx = bufferedreader.readLine()) != null) {
         sx = sx.replaceAll("PLAYERNAME", this.field_22787.Ny().L());

         int ix;
         while ((ix = sx.indexOf(i)) != -1) {
            Object object = sx.substring(0, ix);
            String s1 = sx.substring(ix + i.length());
            sx = object + class06541.field_1068 + class06541.field_1051 + "XXXXXXXX".substring(0, class06069.y(4) + 3) + s1;
         }

         this.N(sx);
         this.L();
      }

      for (int jx = 0; jx < 8; jx++) {
         this.L();
      }
   }

   private float N() {
      return this.b ? this.n * (5.0F + this.j.size() * 15.0F) * this.t : this.n * this.t;
   }

   private void N(String var1) {
      class05216 class05216 = class00392.y(var1);
      this.m.addAll(((class01590)this.field_22787.i_3).L(class05216, 256));
      this.P.add(class05216);
   }

   private void N(class01054 var1) {
      var1.N(class08394.NS, N, 0, 0, 0.0F, 0.0F, this.field_22789, this.field_22790, this.field_22789, this.field_22790);
   }

   private void N(class00392 var1, boolean var2, boolean var3) {
      if (var2) {
         this.s.add(this.m.size());
      }

      this.m.add(var1.method_30937());
      if (var3) {
         this.P.add(var1);
      }
   }

   private void N(class01894 var1, class10459 var2) {
      try (BufferedReader bufferedreader = this.field_22787.Nm().i(var1)) {
         var2.read(bufferedreader);
      } catch (Exception exception) {
         y.error("Couldn't load credits from file {}", var1, exception);
      }
   }

   @Override
   public class05075 method_50024() {
      return class09002.L;
   }

   @Override
   public void method_25426() {
      if (this.m == null) {
         this.m = Lists.newArrayList();
         this.P = Lists.newArrayList();
         this.s = new IntOpenHashSet();
         if (this.U) {
            this.N(B, this::N);
         }

         this.N(Z, this::y);
         if (this.U) {
            this.N(z, this::N);
         }

         this.T = this.m.size() * 12;
      }
   }

   @Override
   public boolean method_25404(class06601 var1) {
      if (var1.B()) {
         this.t = -1;
      } else if (var1.v() == 341 || var1.v() == 345) {
         this.j.add(var1.v());
      } else if (var1.v() == 32) {
         this.b = true;
      }

      this.v = this.N();
      return super.method_25404(var1);
   }

   @Override
   public void method_25393() {
      this.field_22787.A().N();
      this.field_22787.Nr().N(false);
      float f = this.T + this.field_22790 + this.field_22790 + 24;
      if (this.W > f) {
         this.y();
      }
   }

   @Override
   public void method_25432() {
      this.field_22787.A().y(class09002.L);
   }

   @Override
   public void method_25420(class01054 var1, int var2, int var3, float var4) {
      if (this.U) {
         class08627 class08627 = class06202.Nq().NO();
         class08918 class08918x = class08627.y(class03334.N);
         class08918 class08918x = class08627.y(class03334.y);
         class08679 class08679 = class08679.N(class08918x.method_71659(), class08918x.method_75484(), class08918x.method_71659(), class08918x.method_75484());
         var1.N(class08394.Nb, class08679, 0, 0, this.field_22789, this.field_22790);
      } else {
         super.method_25420(var1, var2, var3, var4);
      }
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      this.N(var1);
      this.W = Math.max(0.0F, this.W + var4 * this.v);
      int ix = this.field_22789 / 2 - 128;
      int jx = this.field_22790 + 50;
      float f = -this.W;
      var1.i().pushMatrix();
      var1.i().translate(0.0F, f);
      var1.L();
      this.G.N(var1, this.field_22789, 1.0F, jx);
      int k = jx + 100;

      for (int l = 0; l < this.m.size(); l++) {
         if (l == this.m.size() - 1) {
            float f1 = k + f - (this.field_22790 / 2 - 6);
            if (f1 < 0.0F) {
               var1.i().translate(0.0F, -f1);
            }
         }

         if (k + f + 12.0F + 8.0F > 0.0F && k + f < this.field_22790) {
            class01028 class01028 = this.m.get(l);
            if (this.s.contains(l)) {
               var1.N(this.field_22793, class01028, ix + 128, k, -1);
            } else {
               var1.y(this.field_22793, class01028, ix, k, -1);
            }
         }

         k += 12;
      }

      var1.i().popMatrix();
   }

   @Override
   public void method_25419() {
      this.y();
   }

   @Override
   public boolean method_25421() {
      return !this.U;
   }

   @Override
   protected void method_57736(class01054 var1, int var2, int var3, int var4, int var5) {
      float f = this.W * 0.5F;
      class05096.method_57737(var1, class05096.field_49511, 0, 0, 0.0F, f, var4, var5);
   }

   @Override
   public boolean method_73217() {
      return true;
   }

   @Override
   public boolean method_16803(class06601 var1) {
      if (var1.B()) {
         this.t = 1;
      }

      if (var1.v() == 32) {
         this.b = false;
      } else if (var1.v() == 341 || var1.v() == 345) {
         this.j.remove(var1.v());
      }

      this.v = this.N();
      return super.method_16803(var1);
   }

   @Override
   public class00392 method_25435() {
      return class05220.N(this.P.toArray(class00392[]::new));
   }
}
