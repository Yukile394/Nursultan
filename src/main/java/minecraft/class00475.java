package minecraft;

import org.jspecify.annotations.Nullable;

public abstract class class00475 implements class00381<class07280> {
   protected final int N;
   protected final short y;
   protected final short L;
   protected final short u;
   protected final byte i;
   protected final byte R;
   protected final boolean M;
   protected final boolean B;
   protected final boolean Z;

   public short L() {
      return this.u;
   }

   public float M() {
      return class04995.N(this.R);
   }

   protected class00475(int var1, short var2, short var3, short var4, byte var5, byte var6, boolean var7, boolean var8, boolean var9) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
      this.i = var5;
      this.R = var6;
      this.M = var7;
      this.B = var8;
      this.Z = var9;
   }

   @Override
   public String toString() {
      return "Entity_" + super.toString();
   }

   public boolean B() {
      return this.B;
   }

   public boolean Z() {
      return this.Z;
   }

   public boolean z() {
      return this.M;
   }

   public float u() {
      return class04995.N(this.i);
   }

   public short y() {
      return this.L;
   }

   public short N() {
      return this.y;
   }

   @Nullable
   public class07049 N(class07299 var1) {
      return var1.method_8469(this.N);
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   @Override
   public abstract class02897<? extends class00475> method_65080();
}
