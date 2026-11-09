package minecraft;

public class class00043 extends class08678 {
   private final class08036 m;
   private final class07504 P;
   private final boolean s;

   @Override
   protected boolean T() {
      return this.s != this.m.method_5869();
   }

   public class00043(class08036 var1, class07504 var2, boolean var3, class04891 var4, float var5, float var6, float var7) {
      super(var1, var2, var3, var4, class04911.field_15254, var5, var6, var7);
      this.m = var1;
      this.P = var2;
      this.s = var3;
   }

   @Override
   protected float b() {
      return (float)this.P.method_18798().Z();
   }

   @Override
   protected boolean j() {
      return this.P.method_52172() || !(this.P.N() instanceof class02726);
   }
}
