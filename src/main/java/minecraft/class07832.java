package minecraft;

public record class07832(long time) implements class00381<class03730> {
   public static final class02362<class00667, class07832> N = class00381.N(class07832::N, class07832::new);

   private class07832(class00667 var1) {
      this(var1.readLong());
   }

   public class07832(long time) {
      this.time = time;
   }

   public long N() {
      return this.time;
   }

   public void method_65081(class03730 var1) {
      var1.N(this);
   }

   private void N(class00667 var1) {
      var1.writeLong(this.time);
   }

   @Override
   public class02897<class07832> method_65080() {
      return class04250.N;
   }
}
