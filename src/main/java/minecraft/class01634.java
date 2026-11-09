package minecraft;

record class01634(int count, int age) {
   static final class01634 L = new class01634(0, Integer.MAX_VALUE);

   private class01634(int count, int age) {
      this.count = count;
      this.age = age;
   }

   public int y() {
      return this.age;
   }

   public int N() {
      return this.count;
   }

   public class01634 N(int var1) {
      if (var1 == this.age) {
         return new class01634(this.count + 1, var1);
      } else {
         return var1 < this.age ? new class01634(1, var1) : this;
      }
   }
}
