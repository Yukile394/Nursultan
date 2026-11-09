package minecraft;

class class07169 extends class07952<class08036> {
   public class07169(class07144 var1, class07144 var2) {
      super(var2, class08036.class, true);
      this.Z = var1;
   }

   @Override
   public boolean N() {
      return this.Z.method_73183().y() == class07086.field_5801 ? false : super.N();
   }

   @Override
   protected class00734 N(double var1) {
      class07211 class07211 = ((class07144)this.i).E();
      if (class07211.z() == class07185.field_11048) {
         return this.i.method_5829().L(4.0, var1, var1);
      } else {
         return class07211.z() == class07185.field_11051 ? this.i.method_5829().L(var1, var1, 4.0) : this.i.method_5829().L(var1, 4.0, var1);
      }
   }
}
