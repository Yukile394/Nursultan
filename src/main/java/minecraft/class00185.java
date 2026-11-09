package minecraft;

import org.jspecify.annotations.Nullable;

public abstract class class00185 implements class00044 {
   @Nullable
   protected class00002 N;
   protected final class04911 y;
   protected final class01894 L;
   protected float u = 1.0F;
   protected float i = 1.0F;
   protected double R;
   protected double M;
   protected double B;
   protected boolean Z;
   protected int z;
   protected class00018 U = class00018.field_5476;
   protected boolean E;
   protected class06069 W;

   @Override
   public class01894 L() {
      return this.L;
   }

   @Override
   public int M() {
      return this.z;
   }

   protected class00185(class01894 var1, class04911 var2, class06069 var3) {
      super();
      this.L = var1;
      this.y = var2;
      this.W = var3;
   }

   protected class00185(class04891 var1, class04911 var2, class06069 var3) {
      this(var1.N(), var2, var3);
   }

   @Override
   public String toString() {
      return "SoundInstance[" + this.L + "]";
   }

   @Override
   public float B() {
      return this.u * this.N.L().N(this.W);
   }

   @Override
   public float Z() {
      return this.i * this.N.u().N(this.W);
   }

   @Override
   public class04911 i() {
      return this.y;
   }

   @Override
   public boolean m() {
      return this.E;
   }

   @Override
   public double U() {
      return this.M;
   }

   @Override
   public double z() {
      return this.R;
   }

   @Nullable
   @Override
   public class00002 u() {
      return this.N;
   }

   @Override
   public double E() {
      return this.B;
   }

   @Nullable
   @Override
   public class00137 N(class09033 var1) {
      if (this.L.equals(class09033.L)) {
         this.N = class09033.i;
         return class09033.u;
      } else {
         class00137 class00137 = var1.N(this.L);
         if (class00137 == null) {
            this.N = class09033.y;
         } else {
            this.N = class00137.y(this.W);
         }

         return class00137;
      }
   }

   @Override
   public class00018 W() {
      return this.U;
   }

   @Override
   public boolean R() {
      return this.Z;
   }
}
