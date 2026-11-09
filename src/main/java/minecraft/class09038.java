package minecraft;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Stream;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

@Environment(EnvType.CLIENT)
public class class09038 {
   private static final Marker u = MarkerFactory.getMarker("SOUNDS");
   private static final Logger i = LogUtils.getLogger();
   private static final float R = 0.5F;
   private static final float M = 2.0F;
   private static final float B = 0.0F;
   private static final float Z = 1.0F;
   private static final int z = 20;
   private static final Set<class01894> U = Sets.newHashSet();
   private static final long E = 1000L;
   public static final String N = "FOR THE DEBUG!";
   public static final String y = "OpenAL Soft on ";
   public static final int L = "OpenAL Soft on ".length();
   private final class09033 W;
   private final class05630 m;
   private boolean P;
   private final class06313 s = new class06313();
   private final class06310 T = this.s.i();
   private final class06299 b;
   private final class06292 j = new class06292();
   private final class06323 v = new class06323(this.s, this.j);
   private int n;
   private long t;
   private final AtomicReference<class09010> G = new AtomicReference<>(class09010.field_35086);
   private final Map<class00044, class06311> l = Maps.newHashMap();
   private final Multimap<class04911, class00044> d = HashMultimap.create();
   private final Object2FloatMap<class04911> w = class07536.N(new Object2FloatOpenHashMap(), var0 -> var0.defaultReturnValue(1.0F));
   private final List<class00034> k = Lists.newArrayList();
   private final Map<class00044, Integer> Y = Maps.newHashMap();
   private final Map<class00044, Integer> Q = Maps.newHashMap();
   private final List<class00122> O = Lists.newArrayList();
   private final List<class00034> g = Lists.newArrayList();
   private final List<class00002> I = Lists.newArrayList();

   public void L() {
      if (this.P) {
         this.s.u();
      }
   }

   public class09026 L(class00044 var1) {
      if (!this.P) {
         return class09026.field_60956;
      } else if (!var1.s()) {
         return class09026.field_60956;
      } else {
         class00137 class00137 = var1.N(this.W);
         class01894 class01894x = var1.L();
         if (class00137 == null) {
            if (U.add(class01894x)) {
               i.warn(u, "Unable to play unknown soundEvent: {}", class01894x);
            }

            if (!class07529.Nq) {
               return class09026.field_60956;
            }

            class00137 = new class00137(class01894x, "FOR THE DEBUG!");
         }

         class00002 class00002 = var1.u();
         if (class00002 == class09033.i) {
            return class09026.field_60956;
         } else if (class00002 == class09033.y) {
            if (U.add(class01894x)) {
               i.warn(u, "Unable to play empty soundEvent: {}", class01894x);
            }

            return class09026.field_60956;
         } else {
            float f = var1.B();
            float f1 = Math.max(f, 1.0F) * class00002.Z();
            class04911 class04911 = var1.i();
            float f2 = this.N(f, class04911);
            float f3 = this.M(var1);
            class00018 class00018 = var1.W();
            boolean flag = var1.m();
            if (!this.O.isEmpty()) {
               float f4 = !flag && class00018 != class00018.field_5478 ? f1 : Float.POSITIVE_INFINITY;

               for (class00122 class00122 : this.O) {
                  class00122.N(var1, class00137, f4);
               }
            }

            boolean flag2 = false;
            if (f2 == 0.0F) {
               if (!var1.w_() && class04911 != class04911.field_15253) {
                  i.debug(u, "Skipped playing sound {}, volume was zero.", class00002.N());
                  return class09026.field_60956;
               }

               flag2 = true;
            }

            class06889 class06889 = new class06889(var1.z(), var1.U(), var1.E());
            boolean flag3 = R(var1);
            boolean flag1 = class00002.M();
            class06311 class06311 = this.v.N(class00002.M() ? class06319.field_18353 : class06319.field_18352).join();
            if (class06311 == null) {
               if (class07529.ND) {
                  i.warn("Failed to create new sound handle");
               }

               return class09026.field_60956;
            } else {
               i.debug(u, "Playing sound {} for event {}", class00002.N(), class01894x);
               this.Q.put(var1, this.n + 20);
               this.l.put(var1, class06311);
               this.d.put(class04911, var1);
               class06311.N(var8x -> {
                  var8x.N(f3);
                  var8x.y(f2);
                  if (class00018 == class00018.field_5476) {
                     var8x.L(f1);
                  } else {
                     var8x.Z();
                  }

                  var8x.N(flag3 && !flag1);
                  var8x.N(class06889);
                  var8x.y(flag);
               });
               if (!flag1) {
                  this.b.N(class00002.y()).thenAccept(var1x -> class06311.N(var1xx -> {
                     var1xx.N(var1x);
                     var1xx.L();
                  }));
               } else {
                  class06299 class06299x = this.b;
                  class01894 class01894x = class00002.y();
                  class06299 class06299x = class06299x;
                  this.N(class06299x, class01894x, flag3, var1).thenAccept(var1x -> class06311.N(var1xx -> {
                     var1xx.N(var1x);
                     var1xx.L();
                  }));
               }

               if (var1 instanceof class00034) {
                  this.k.add((class00034)var1);
               }

               return flag2 ? class09026.field_60955 : class09026.field_60954;
            }
         }
      }
   }

   public List<String> M() {
      return this.s.M();
   }

   private float M(class00044 var1) {
      return class04995.N(var1.Z(), 0.5F, 2.0F);
   }

   public class09038(class09033 var1, class05630 var2, class02857 var3) {
      super();
      this.W = var1;
      this.m = var2;
      this.b = new class06299(var3);
   }

   public class03836 B() {
      return this.T.y();
   }

   private float B(class00044 var1) {
      return this.N(var1.B(), var1.i());
   }

   private synchronized void Z() {
      if (!this.P) {
         try {
            String sx = this.m.Ne().method_41753();
            this.s.N("".equals(sx) ? null : sx, this.m.NE().method_41753());
            this.T.N();
            this.b.N(this.I).thenRun(this.I::clear);
            this.P = true;
            i.info(u, "Sound engine started");
         } catch (RuntimeException runtimeexception) {
            i.error(u, "Error starting SoundSystem. Turning off sounds & music", runtimeexception);
         }
      }
   }

   private static boolean i(class00044 var0) {
      return var0.R() && u(var0);
   }

   public void i() {
      if (this.P) {
         this.v.N(var0 -> var0.forEach(class06297::i));
      }
   }

   private void U() {
      this.n++;
      this.g.stream().filter(class00044::s).forEach(this::L);
      this.g.clear();

      for (class00034 class00034 : this.k) {
         if (!class00034.s()) {
            this.N((class00044)class00034);
         }

         class00034.P();
         if (class00034.N()) {
            this.N((class00044)class00034);
         } else {
            float f = this.B(class00034);
            float f1 = this.M(class00034);
            class06889 class06889 = new class06889(class00034.z(), class00034.U(), class00034.E());
            class06311 class06311x = this.l.get(class00034);
            if (class06311x != null) {
               class06311x.N(var3x -> {
                  var3x.y(f);
                  var3x.N(f1);
                  var3x.N(class06889);
               });
            }
         }
      }

      Iterator iterator = this.l.entrySet().iterator();

      while (iterator.hasNext()) {
         Entry entry = (Entry)iterator.next();
         class06311 class06311 = (class06311)entry.getValue();
         class00044 class00044x = (class00044)entry.getKey();
         if (class06311.N()) {
            int ix = this.Q.get(class00044x);
            if (ix <= this.n) {
               if (i(class00044x)) {
                  this.Y.put(class00044x, this.n + class00044x.M());
               }

               iterator.remove();
               i.debug(u, "Removed channel {} because it's not playing anymore", class06311);
               this.Q.remove(class00044x);

               try {
                  this.d.remove(class00044x.i(), class00044x);
               } catch (RuntimeException runtimeexception) {
               }

               if (class00044x instanceof class00034) {
                  this.k.remove(class00044x);
               }
            }
         }
      }

      Iterator iterator1 = this.Y.entrySet().iterator();

      while (iterator1.hasNext()) {
         Entry entry1 = (Entry)iterator1.next();
         if (this.n >= (Integer)entry1.getValue()) {
            class00044 class00044 = (class00044)entry1.getKey();
            if (class00044 instanceof class00034) {
               ((class00034)class00044).P();
            }

            this.L(class00044);
            iterator1.remove();
         }
      }
   }

   private boolean z() {
      if (this.s.B()) {
         i.info("Audio device was lost!");
         return true;
      } else {
         long ix = class07536.L();
         if (ix - this.t >= 1000L) {
            this.t = ix;
            if (this.G.compareAndSet(class09010.field_35086, class09010.field_35084)) {
               String sx = this.m.Ne().method_41753();
               class07536.Z().execute(() -> {
                  if ("".equals(sx)) {
                     if (this.s.L()) {
                        i.info("System default audio device has changed!");
                        this.G.compareAndSet(class09010.field_35084, class09010.field_35085);
                     }
                  } else if (!this.s.y().equals(sx) && this.s.M().contains(sx)) {
                     i.info("Preferred audio device has become available!");
                     this.G.compareAndSet(class09010.field_35084, class09010.field_35085);
                  }

                  this.G.compareAndSet(class09010.field_35084, class09010.field_35086);
               });
            }
         }

         return this.G.compareAndSet(class09010.field_35085, class09010.field_35086);
      }
   }

   public void u() {
      if (this.P) {
         this.j.N();
         this.l.clear();
         this.v.y();
         this.Y.clear();
         this.k.clear();
         this.d.clear();
         this.Q.clear();
         this.g.clear();
         this.w.clear();
         this.j.y();
      }
   }

   private static boolean u(class00044 var0) {
      return var0.M() > 0;
   }

   public boolean y(class00044 var1) {
      if (!this.P) {
         return false;
      } else {
         return this.Q.containsKey(var1) && this.Q.get(var1) <= this.n ? true : this.l.containsKey(var1);
      }
   }

   public void y() {
      if (this.P) {
         this.u();
         this.b.N();
         this.s.u();
         this.P = false;
      }
   }

   public void y(class00122 var1) {
      this.O.remove(var1);
   }

   private void E() {
      Iterator<Entry<class00044, class06311>> iterator = this.l.entrySet().iterator();

      while (iterator.hasNext()) {
         Entry entry = iterator.next();
         class06311 class06311 = (class06311)entry.getValue();
         class00044 class00044 = (class00044)entry.getKey();
         if (class00044.i() == class04911.field_15253 && class06311.N()) {
            iterator.remove();
            i.debug(u, "Removed channel {} because it's not playing anymore", class06311);
            this.Q.remove(class00044);
            this.d.remove(class00044.i(), class00044);
         }
      }
   }

   private CompletableFuture N(class06299 var1, class01894 var2, boolean var3, class00044 var4) {
      return var4.getAudioStream(var1, var2, var3);
   }

   public void N() {
      U.clear();

      for (class04891 class04891 : class04206.y) {
         if (class04891 != class04909.vk) {
            class01894 class01894 = class04891.N();
            if (this.W.N(class01894) == null) {
               i.warn("Missing sound for event: {}", class04206.y.y(class04891));
               U.add(class01894);
            }
         }
      }

      this.y();
      this.Z();
   }

   public void N(class00034 var1) {
      this.g.add(var1);
   }

   public void N(class00002 var1) {
      this.I.add(var1);
   }

   public void N(class00044 var1) {
      if (this.P) {
         class06311 class06311 = this.l.get(var1);
         if (class06311 != null) {
            class06311.N(class06297::R);
         }
      }
   }

   private float N(float var1, class04911 var2) {
      return class04995.N(var1, 0.0F, 1.0F) * class04995.N(this.m.N(var2), 0.0F, 1.0F) * this.w.getFloat(var2);
   }

   public void N(class04911 var1, float var2) {
      this.w.put(var1, class04995.N(var2, 0.0F, 1.0F));
      this.N(var1);
   }

   public void N(boolean var1) {
      if (this.z()) {
         this.N();
      }

      if (!var1) {
         this.U();
      } else {
         this.E();
      }

      this.v.N();
   }

   public void N(class00122 var1) {
      this.O.add(var1);
   }

   public void N(class04911 var1) {
      if (this.P) {
         this.l.forEach((var2, var3) -> {
            if (var1 == var2.i() || var1 == class04911.field_15250) {
               float f = this.B(var2);
               var3.N(var1xx -> var1xx.y(f));
            }
         });
      }
   }

   public void N(@Nullable class01894 var1, @Nullable class04911 var2) {
      if (var2 != null) {
         for (class00044 class00044x : this.d.get(var2)) {
            if (var1 == null || class00044x.L().equals(var1)) {
               this.N(class00044x);
            }
         }
      } else if (var1 == null) {
         this.u();
      } else {
         for (class00044 class00044x : this.l.keySet()) {
            if (class00044x.L().equals(var1)) {
               this.N(class00044x);
            }
         }
      }
   }

   public void N(class05363 var1) {
      if (this.P && var1.Z()) {
         class03836 class03836 = new class03836(var1.y(), new class06889(var1.m()), new class06889(var1.P()));
         this.j.execute(() -> this.T.N(class03836));
      }
   }

   public void N(class04911... var1) {
      if (this.P) {
         for (Entry entry : this.l.entrySet()) {
            if (!List.of(var1).contains(((class00044)entry.getKey()).i())) {
               ((class06311)entry.getValue()).N(class06297::u);
            }
         }
      }
   }

   public void N(class00044 var1, int var2) {
      this.Y.put(var1, this.n + var2);
   }

   private static boolean R(class00044 var0) {
      return var0.R() && !u(var0);
   }

   public String R() {
      return this.s.R();
   }
}
