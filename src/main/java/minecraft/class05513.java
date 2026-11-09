package minecraft;

import com.google.common.base.Stopwatch;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2LongMap;
import it.unimi.dsi.fastutil.objects.Object2LongOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2LongMap.Entry;
import java.util.Collection;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public class class05513 {
   private final class03529<class00201> N;
   @Nullable
   private class07209 y;
   private final class04782 L;
   private final Collection<class05532> u = Lists.newArrayList();
   private final int i;
   private final Collection<class05882> R = Lists.newCopyOnWriteArrayList();
   private final Object2LongMap<Runnable> M = new Object2LongOpenHashMap();
   private boolean B;
   private boolean Z;
   private int z;
   private boolean U;
   private final class04272 E;
   private final Stopwatch W = Stopwatch.createUnstarted();
   private boolean m;
   private final class06993 P;
   @Nullable
   private class08405 s;
   @Nullable
   private class08610 T;

   public int w() {
      return this.N.N().z();
   }

   @Nullable
   public class07209 L() {
      return this.y;
   }

   public class04782 M() {
      return this.L;
   }

   @Nullable
   public class05513 P() {
      class08610 class08610 = this.N(Objects.requireNonNull(this.y), this.P, this.L);
      if (class08610 != null) {
         this.T = class08610;
         this.N();
         return this;
      } else {
         return null;
      }
   }

   class05882 T() {
      class05882 class05882 = new class05882(this);
      this.R.add(class05882);
      return class05882;
   }

   public Stream<class05532> Q() {
      return this.u.stream();
   }

   public class05513(class03529<class00201> var1, class06993 var2, class04782 var3, class04272 var4) {
      super();
      this.N = var1;
      this.L = var3;
      this.E = var4;
      this.i = ((class00201)var1.N()).R();
      this.P = var2;
   }

   @Override
   public String toString() {
      return this.y().toString();
   }

   public boolean B() {
      return this.m && this.s == null;
   }

   private void I() {
      if (!this.U) {
         this.U = true;
         this.W.start();
         this.R().m();

         try {
            this.N.N().N(new class05523(this));
         } catch (class08405 class08405) {
            this.N(class08405);
         } catch (Exception exception) {
            this.N(new class08432(exception));
         }
      }
   }

   private void J() {
      if (!this.m) {
         this.m = true;
         if (this.W.isRunning()) {
            this.W.stop();
         }
      }
   }

   public boolean Z() {
      return this.s != null;
   }

   public class00734 i() {
      return this.R().R();
   }

   public boolean b() {
      return this.N.N().B();
   }

   int s() {
      return this.z;
   }

   public class06993 n() {
      return this.N.N().m().R().N(this.P);
   }

   public int l() {
      return this.i;
   }

   public boolean d() {
      return this.N.N().z() > 1;
   }

   @Nullable
   public class08405 m() {
      return this.s;
   }

   public int k() {
      return this.N.N().U();
   }

   public class00201 t() {
      return this.N.N();
   }

   private void g() {
      this.z++;
      if (this.z >= 0) {
         if (!this.U) {
            this.I();
         }

         ObjectIterator<Entry<Runnable>> objectiterator = this.M.object2LongEntrySet().iterator();

         while (objectiterator.hasNext()) {
            Entry entry = (Entry)objectiterator.next();
            if (entry.getLongValue() <= this.z) {
               try {
                  ((Runnable)entry.getKey()).run();
               } catch (class08405 class08405) {
                  this.N(class08405);
               } catch (Exception exception) {
                  this.N(new class08432(exception));
               }

               objectiterator.remove();
            }
         }

         if (this.z > this.i) {
            if (this.R.isEmpty()) {
               this.N(new class05524(class00392.N("test.error.timeout.no_result", this.N.N().R())));
            } else {
               this.R.forEach(var1x -> var1x.L(this.z));
               if (this.s == null) {
                  this.N(new class05524(class00392.N("test.error.timeout.no_sequences_finished", this.N.N().R())));
               }
            }
         } else {
            this.R.forEach(var1x -> var1x.y(this.z));
         }
      }
   }

   public class01894 v() {
      return this.N.N().i();
   }

   public boolean j() {
      return !this.N.N().B();
   }

   public boolean U() {
      return this.m;
   }

   public boolean z() {
      return this.U;
   }

   public class07209 u() {
      return this.T.b();
   }

   public class01894 y() {
      return this.N.B().N();
   }

   public long E() {
      return this.W.elapsed(TimeUnit.MILLISECONDS);
   }

   public void N(class05520 var1) {
      if (!this.U()) {
         if (!this.B) {
            this.N(class00392.L("test.error.ticking_without_structure"));
         }

         if (this.T == null) {
            this.N(class00392.L("test.error.missing_block_entity"));
         }

         if (this.s != null) {
            this.J();
         }

         if (this.Z || this.T.u().y().allMatch(this.L::method_66588)) {
            this.Z = true;
            this.g();
            if (this.U()) {
               if (this.s != null) {
                  this.u.forEach(var2 -> var2.y(this, var1));
               } else {
                  this.u.forEach(var2 -> var2.N(this, var1));
               }
            }
         }
      }
   }

   public void N(class05532 var1) {
      this.u.add(var1);
   }

   public void N(@Nullable class07209 var1) {
      this.y = var1;
   }

   public class05513 N(int var1) {
      this.z = -(this.N.N().M() + var1 + 1);
      return this;
   }

   public void N() {
      if (!this.B) {
         class08610 class08610 = this.R();
         if (!class08610.T()) {
            this.N(class00392.N("test.error.structure.failure", class08610.B().getString()));
         }

         this.B = true;
         class08610.j();
         class05163 class05163 = class08610.u();
         this.L.method_14196().N(class05163);
         this.L.method_23658(class05163);
         this.u.forEach(var1x -> var1x.N(this));
      }
   }

   public void N(class00392 var1) {
      this.N(new class05511(var1, this.z));
   }

   public void N(class08405 var1) {
      this.s = var1;
   }

   @Nullable
   private class08610 N(class07209 var1, class06993 var2, class04782 var3) {
      var3.method_8501(var1, class00869.Ty.W());
      if (var3.method_8321(var1) instanceof class08610 class08610) {
         class05946<class00201> class05946 = this.G().B();
         class00753 class00753 = class08610.N(var3, class05946).orElse(new class00753(1, 1, 1));
         class08610.N(new class08595(Optional.of(class05946), class00753, var2, false, class08625.field_56014, Optional.empty()));
         return class08610;
      } else {
         return null;
      }
   }

   public void N(long var1, Runnable var3) {
      this.M.put(var3, var1);
   }

   public void W() {
      if (this.s == null) {
         this.J();
         class00734 class00734 = this.i();
         this.M().N(class07049.class, class00734.M(1.0), var0 -> !(var0 instanceof class08036)).forEach(var0 -> var0.method_5650(class07062.field_26999));
      }
   }

   public class08610 R() {
      if (this.T == null) {
         if (this.y == null) {
            throw new IllegalStateException("This GameTestInfo has no position");
         }

         if (this.L.method_8321(this.y) instanceof class08610 class08610) {
            this.T = class08610;
         }

         if (this.T == null) {
            throw new IllegalStateException("Could not find a test instance block entity at the given coordinate " + this.y);
         }
      }

      return this.T;
   }

   public class05513 O() {
      class05513 class05513 = new class05513(this.N, this.P, this.L, this.Y());
      if (this.y != null) {
         class05513.N(this.y);
      }

      return class05513;
   }

   public class03529<class00201> G() {
      return this.N;
   }

   public class04272 Y() {
      return this.E;
   }
}
