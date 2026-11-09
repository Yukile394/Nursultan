package minecraft;

class class08996 implements class00124<class00002> {
   class08996(class09023 var1, class01894 var2, class00002 var3) {
      super();
      this.L = var1;
      this.N = var2;
      this.y = var3;
   }

   @Override
   public int i() {
      class00137 class00137 = this.L.N.get(this.N);
      return class00137 == null ? 0 : class00137.i();
   }

   @Override
   public void N(class09038 var1) {
      class00137 class00137 = this.L.N.get(this.N);
      if (class00137 != null) {
         class00137.N(var1);
      }
   }

   public class00002 y(class06069 var1) {
      class00137 class00137 = this.L.N.get(this.N);
      if (class00137 == null) {
         return class09033.y;
      } else {
         class00002 class00002 = class00137.y(var1);
         return new class00002(
            class00002.N(),
            new class03620(class00002.L(), this.y.L()),
            new class03620(class00002.u(), this.y.u()),
            this.y.i(),
            class00022.field_5474,
            class00002.M() || this.y.M(),
            class00002.B(),
            class00002.Z()
         );
      }
   }
}
