package minecraft;

public record class03277(int id, float yaw) implements class00381<class07280> {
   public static final class02362<class00667, class03277> N = class00381.N(class03277::N, class03277::new);

   public class03277(int id, float yaw) {
      super();
      this.id = id;
      this.yaw = yaw;
   }

   private class03277(class00667 var1) {
      this(var1.E(), var1.readFloat());
   }

   public class03277(class07438 var1) {
      this(var1.method_5628(), var1.method_48157());
   }

   public float y() {
      return this.yaw;
   }

   public int N() {
      return this.id;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   private void N(class00667 var1) {
      var1.L(this.id);
      var1.writeFloat(this.yaw);
   }

   @Override
   public class02897<class03277> method_65080() {
      return class04248.c;
   }
}
