package minecraft;

import java.util.function.Consumer;

public abstract class class01202<E extends class01202<E>> implements class02102, class04654 {
   public static final int field_62115 = 2;
   private int field_62111 = 0;
   private int field_62112 = 0;
   private int field_62113 = 0;
   private int field_62114;
   @Deprecated
   public class01212<E> field_22752;

   public class01202() {
      super();
   }

   @Override
   public class03255 method_48202() {
      return class02102.super.method_48202();
   }

   @Override
   public boolean method_25405(double var1, double var3) {
      return this.method_48202().N((int)var1, (int)var3);
   }

   @Override
   public void method_25365(boolean var1) {
   }

   @Override
   public boolean method_25370() {
      return this.field_22752.method_25336() == this;
   }

   @Override
   public void method_48206(Consumer<class06478> var1) {
   }

   @Override
   public int method_46427() {
      return this.field_62112;
   }

   @Override
   public void method_46419(int var1) {
      this.field_62112 = var1;
   }

   @Override
   public int method_46426() {
      return this.field_62111;
   }

   @Override
   public void method_46421(int var1) {
      this.field_62111 = var1;
   }

   @Override
   public int method_25364() {
      return this.field_62114;
   }

   @Override
   public int method_25368() {
      return this.field_62113;
   }

   public abstract void method_25343(class01054 var1, int var2, int var3, boolean var4, float var5);

   public int method_73382() {
      return this.method_46427() + 2;
   }

   public int method_73385() {
      return this.method_73382() + this.method_73384() / 2;
   }

   public int method_73389() {
      return this.method_73380() + this.method_73387();
   }

   public int method_73380() {
      return this.method_46426() + 2;
   }

   public void method_73381(int var1) {
      this.field_62113 = var1;
   }

   public int method_73386() {
      return this.method_73382() + this.method_73384();
   }

   public int method_73384() {
      return this.method_25364() - 4;
   }

   public int method_73387() {
      return this.method_25368() - 4;
   }

   public int method_73388() {
      return this.method_73380() + this.method_73387() / 2;
   }

   public void method_73383(int var1) {
      this.field_62114 = var1;
   }
}
