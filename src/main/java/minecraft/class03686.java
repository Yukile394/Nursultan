package minecraft;

import java.util.function.Consumer;

public class class03686 implements class03695 {
   public static final int N = 13;
   public static final int y = 33;
   private static final int L = 30;
   private final class02077 u = new class02077();
   private final class02077 i = new class02077();
   private final class02077 R = new class02077();
   private final class05096 M;
   private int B;
   private int Z;

   public int L() {
      return this.B;
   }

   public <T extends class02102> T L(T var1) {
      return this.R.N((T)var1);
   }

   public <T extends class02102> T L(T var1, Consumer<class02072> var2) {
      return this.R.N((T)var1, var2);
   }

   public class03686(class05096 var1) {
      this(var1, 33);
   }

   public class03686(class05096 var1, int var2, int var3) {
      super();
      this.M = var1;
      this.B = var2;
      this.Z = var3;
      this.u.L().N(0.5F, 0.5F);
      this.i.L().N(0.5F, 0.5F);
   }

   public class03686(class05096 var1, int var2) {
      this(var1, var2, var2);
   }

   public int u() {
      return this.M.field_22790 - this.L() - this.y();
   }

   public <T extends class02102> T y(T var1, Consumer<class02072> var2) {
      return this.i.N((T)var1, var2);
   }

   public void y(int var1) {
      this.B = var1;
   }

   public <T extends class02102> T y(T var1) {
      return this.i.N((T)var1);
   }

   public int y() {
      return this.Z;
   }

   @Override
   public void N() {
      int ix = this.L();
      int j = this.y();
      this.u.y(this.M.field_22789);
      this.u.N(ix);
      this.u.y(0, 0);
      this.u.N();
      this.i.y(this.M.field_22789);
      this.i.N(j);
      this.i.N();
      this.i.method_46419(this.M.field_22790 - j);
      this.R.y(this.M.field_22789);
      this.R.N();
      int k = ix + 30;
      int l = this.M.field_22790 - j - this.R.method_25364();
      this.R.y(0, Math.min(k, l));
   }

   public <T extends class02102> T N(T var1) {
      return this.u.N((T)var1);
   }

   public void N(class00392 var1, class01590 var2) {
      this.u.N(new class02071(var1, var2));
   }

   public <T extends class02102> T N(T var1, Consumer<class02072> var2) {
      return this.u.N((T)var1, var2);
   }

   public void N(int var1) {
      this.Z = var1;
   }

   @Override
   public void N(Consumer<class02102> var1) {
      this.u.N(var1);
      this.R.N(var1);
      this.i.N(var1);
   }

   @Override
   public int method_46427() {
      return 0;
   }

   @Override
   public void method_46419(int var1) {
   }

   @Override
   public int method_46426() {
      return 0;
   }

   @Override
   public void method_46421(int var1) {
   }

   @Override
   public int method_25364() {
      return this.M.field_22790;
   }

   @Override
   public int method_25368() {
      return this.M.field_22789;
   }
}
