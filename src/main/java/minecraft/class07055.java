package minecraft;

import com.google.common.collect.ComparisonChain;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.Optional;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class07055 implements Comparable<class07055> {
   private static final Logger R = LogUtils.getLogger();
   public static final int N = -1;
   public static final int y = 0;
   public static final int L = 255;
   public static final Codec<class07055> u = RecordCodecBuilder.create(
      var0 -> var0.group(class07084.N.fieldOf("id").forGetter(class07055::L), class07069.N.forGetter(class07055::E)).apply(var0, class07055::new)
   );
   public static final class02362<class04247, class07055> i = class02362.N(class07084.y, class07055::L, class07069.y, class07055::E, class07055::new);
   private final class03556<class07084> M;
   private int B;
   private int Z;
   private boolean z;
   private boolean U;
   private boolean E;
   @Nullable
   private class07055 W;
   private final class07053 m = new class07053();

   public class03556<class07084> L() {
      return this.M;
   }

   public int compareTo(class07055 var1) {
      short short1 = 32147;
      return (this.u() <= 32147 || var1.u() <= 32147) && (!this.R() || !var1.R())
         ? ComparisonChain.start()
            .compareFalseFirst(this.R(), var1.R())
            .compareFalseFirst(this.y(), var1.y())
            .compare(this.u(), var1.u())
            .compare(this.L().N().Z(), var1.L().N().Z())
            .result()
         : ComparisonChain.start().compare(this.R(), var1.R()).compare(this.L().N().Z(), var1.L().N().Z()).result();
   }

   public boolean M() {
      return this.U;
   }

   private boolean P() {
      if (this.B == 0 && this.W != null) {
         this.N(this.W);
         this.W = this.W.W;
         return true;
      } else {
         return false;
      }
   }

   public class07055(class07055 var1) {
      super();
      this.M = var1.M;
      this.N(var1);
   }

   private class07055(class03556<class07084> var1, class07069 var2) {
      this(var1, var2.y(), var2.N(), var2.L(), var2.u(), var2.i(), var2.R().map(var1x -> new class07055(var1, var1x)).orElse(null));
   }

   public class07055(class03556<class07084> var1) {
      this(var1, 0, 0);
   }

   public class07055(class03556<class07084> var1, int var2, int var3, boolean var4, boolean var5, boolean var6) {
      this(var1, var2, var3, var4, var5, var6, null);
   }

   public class07055(class03556<class07084> var1, int var2, int var3, boolean var4, boolean var5) {
      this(var1, var2, var3, var4, var5, var5);
   }

   public class07055(class03556<class07084> var1, int var2, int var3) {
      this(var1, var2, var3, false, true);
   }

   public class07055(class03556<class07084> var1, int var2) {
      this(var1, var2, 0);
   }

   public class07055(class03556<class07084> var1, int var2, int var3, boolean var4, boolean var5, boolean var6, @Nullable class07055 var7) {
      super();
      this.M = var1;
      this.B = var2;
      short short1 = 255;
      byte b0 = 0;
      this.Z = this.N(var3, b0, short1);
      this.z = var4;
      this.U = var5;
      this.E = var6;
      this.W = var7;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof class07055 class07055)
            ? false
            : this.B == class07055.B
               && this.Z == class07055.Z
               && this.z == class07055.z
               && this.U == class07055.U
               && this.E == class07055.E
               && this.M.equals(class07055.M);
      }
   }

   @Override
   public String toString() {
      String s;
      if (this.Z > 0) {
         s = this.z() + " x " + (this.Z + 1) + ", Duration: " + this.s();
      } else {
         s = this.z() + ", Duration: " + this.s();
      }

      if (!this.U) {
         s = s + ", Particles: false";
      }

      if (!this.E) {
         s = s + ", Show Icon: false";
      }

      return s;
   }

   @Override
   public int hashCode() {
      int ix = this.M.hashCode();
      ix = 31 * ix + this.B;
      ix = 31 * ix + this.Z;
      ix = 31 * ix + (this.z ? 1 : 0);
      ix = 31 * ix + (this.U ? 1 : 0);
      return 31 * ix + (this.E ? 1 : 0);
   }

   public boolean B() {
      return this.E;
   }

   public void Z() {
      if (this.W()) {
         this.m();
         this.P();
      }

      this.m.y(this);
   }

   public int i() {
      return this.Z;
   }

   private boolean i(class07055 var1) {
      return !this.y() && (this.B < var1.B || var1.y());
   }

   private String s() {
      return this.y() ? "infinite" : Integer.toString(this.B);
   }

   private void m() {
      if (this.W != null) {
         this.W.m();
      }

      this.B = this.N((Int2IntFunction)(var0 -> var0 - 1));
   }

   public void U() {
      this.m.N(this);
   }

   public String z() {
      return this.M.N().R();
   }

   public void u(class07055 var1) {
      this.m.N(var1.m);
   }

   public int u() {
      return this.B;
   }

   public boolean y() {
      return this.B == -1;
   }

   public boolean y(class07055 var1) {
      if (!this.M.equals(var1.M)) {
         R.warn("This method should only be called for matching effects!");
      }

      boolean flag = false;
      if (var1.Z > this.Z) {
         if (var1.i(this)) {
            class07055 class07055 = this.W;
            this.W = new class07055(this);
            this.W.W = class07055;
         }

         this.Z = var1.Z;
         this.B = var1.B;
         flag = true;
      } else if (this.i(var1)) {
         if (var1.Z == this.Z) {
            this.B = var1.B;
            flag = true;
         } else if (this.W == null) {
            this.W = new class07055(var1);
         } else {
            this.W.y(var1);
         }
      }

      if (!var1.z && this.z || flag) {
         this.z = var1.z;
         flag = true;
      }

      if (var1.U != this.U) {
         this.U = var1.U;
         flag = true;
      }

      if (var1.E != this.E) {
         this.E = var1.E;
         flag = true;
      }

      return flag;
   }

   public void y(class07438 var1) {
      this.M.N().y(var1, this.Z);
   }

   private class07069 E() {
      return new class07069(this.i(), this.u(), this.R(), this.M(), this.B(), Optional.ofNullable(this.W).map(class07055::E));
   }

   private int N(int var1, int var2, int var3) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20_3) ? var1 : class04995.N(var1, var2, var3);
   }

   public boolean N(class03556<class07084> var1) {
      return this.M.equals(var1);
   }

   public int N(Int2IntFunction var1) {
      return !this.y() && this.B != 0 ? var1.applyAsInt(this.B) : this.B;
   }

   public class07055 N(float var1) {
      class07055 class07055 = new class07055(this);
      class07055.B = class07055.N((Int2IntFunction)(var1x -> Math.max(class04995.y(var1x * var1), 1)));
      return class07055;
   }

   public boolean N(int var1) {
      return !this.y() && this.B <= var1;
   }

   void N(class07055 var1) {
      this.B = var1.B;
      this.Z = var1.Z;
      this.z = var1.z;
      this.U = var1.U;
      this.E = var1.E;
   }

   public class07126 N() {
      return this.M.N().N(this);
   }

   public float N(class07438 var1, float var2) {
      return this.m.N(var1, var2);
   }

   public void N(class04782 var1, class07438 var2, class07062 var3) {
      this.M.N().N(var1, var2, this.Z, var3);
   }

   public void N(class04782 var1, class07438 var2, class07072 var3, float var4) {
      this.M.N().N(var1, var2, this.Z, var3, var4);
   }

   public void N(class07438 var1) {
      this.M.N().N(var1, this.Z);
   }

   public boolean N(class04782 var1, class07438 var2, Runnable var3) {
      if (!this.W()) {
         return false;
      } else {
         int ix = this.y() ? var2.field_6012 : this.B;
         if (this.M.N().N(ix, this.Z) && !this.M.N().N(var1, var2, this.Z)) {
            return false;
         } else {
            this.m();
            if (this.P()) {
               var3.run();
            }

            return this.W();
         }
      }
   }

   private boolean W() {
      return this.y() || this.B > 0;
   }

   public boolean R() {
      return this.z;
   }
}
