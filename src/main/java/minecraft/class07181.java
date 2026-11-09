package minecraft;

class class07181 extends class07952<class07438> {
   public class07181(class07144 var1) {
      super(var1, class07438.class, 10, true, false, (var0, var1x) -> var0 instanceof class07542);
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

   @Override
   public boolean N() {
      return this.i.method_5781() == null ? false : super.N();
   }
}
