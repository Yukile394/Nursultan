package minecraft;

class class00048 extends class05724<class00075> {
   class00048(class00089 var1) {
      super(class00089.N(var1), var1.field_22789, var1.field_22790 - 77, 40, 16);
      this.N = var1;
      this.method_25321(new class00075(this, class00050.field_60227, null));
      this.method_25321(new class00075(this, class00050.field_60226, null));
      var1.N.keySet().stream().map(var1x -> new class00075(this, class00050.field_60228, var1x)).forEach(var1x -> this.method_25321(var1x));
   }

   public void method_25313(class00075 var1) {
      super.method_25313(var1);
      if (var1 != null) {
         this.N.y = var1.N;
      }

      this.N.y();
   }
}
