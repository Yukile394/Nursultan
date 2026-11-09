package minecraft;

public class class02953 extends class06942 {
   private final class07211 y;

   @Override
   public class07211 L() {
      return class07211.field_11033;
   }

   public class02953(class07299 var1, class07209 var2, class07211 var3, class06584 var4, class07211 var5) {
      super(var1, null, class07050.field_5808, var4, new class06183(class06889.L(var2), var5, var2, false));
      this.y = var3;
   }

   @Override
   public class07211[] i() {
      switch (this.y) {
         case field_11033:
         default:
            return new class07211[]{
               class07211.field_11033, class07211.field_11043, class07211.field_11034, class07211.field_11035, class07211.field_11039, class07211.field_11036
            };
         case field_11036:
            return new class07211[]{
               class07211.field_11033, class07211.field_11036, class07211.field_11043, class07211.field_11034, class07211.field_11035, class07211.field_11039
            };
         case field_11043:
            return new class07211[]{
               class07211.field_11033, class07211.field_11043, class07211.field_11034, class07211.field_11039, class07211.field_11036, class07211.field_11035
            };
         case field_11035:
            return new class07211[]{
               class07211.field_11033, class07211.field_11035, class07211.field_11034, class07211.field_11039, class07211.field_11036, class07211.field_11043
            };
         case field_11039:
            return new class07211[]{
               class07211.field_11033, class07211.field_11039, class07211.field_11035, class07211.field_11036, class07211.field_11043, class07211.field_11034
            };
         case field_11034:
            return new class07211[]{
               class07211.field_11033, class07211.field_11034, class07211.field_11035, class07211.field_11036, class07211.field_11043, class07211.field_11039
            };
      }
   }

   @Override
   public boolean y() {
      return this.N();
   }

   @Override
   public boolean N() {
      return this.method_8045().method_8320(this.method_30344().u()).N(this);
   }

   @Override
   public class07209 method_8037() {
      return this.method_30344().u();
   }

   @Override
   public float method_8044() {
      return this.y.u() * 90;
   }

   @Override
   public class07211 method_8042() {
      return this.y.z() == class07185.field_11052 ? class07211.field_11043 : this.y;
   }

   @Override
   public boolean method_8046() {
      return false;
   }
}
