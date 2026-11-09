package minecraft;

class class07250 extends class01114 {
   class07250(class07281 var1) {
      super();
      this.N = var1;
   }

   @Override
   protected void y(class07299 var1, class07209 var2, class00500 var3) {
      var1.method_43128(
         null,
         var2.method_10263() + 0.5,
         var2.method_10264() + 0.5,
         var2.method_10260() + 0.5,
         class04909.zJ,
         class04911.field_15245,
         0.5F,
         var1.field_9229.z() * 0.1F + 0.9F
      );
   }

   @Override
   protected void N(class07299 var1, class07209 var2, class00500 var3) {
      var1.method_43128(
         null,
         var2.method_10263() + 0.5,
         var2.method_10264() + 0.5,
         var2.method_10260() + 0.5,
         class04909.zo,
         class04911.field_15245,
         0.5F,
         var1.field_9229.z() * 0.1F + 0.9F
      );
   }

   @Override
   protected void N(class07299 var1, class07209 var2, class00500 var3, int var4, int var5) {
      var1.method_8427(this.N.U, class00869.Mt, 1, var5);
   }

   @Override
   public boolean N(class08036 var1) {
      return var1.method_7274().y(this.N);
   }
}
