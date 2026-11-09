package minecraft;

record class03685(class01404 previous, class01404 current) implements class03665<class01404> {
   class03685(class01404 previous, class01404 current) {
      this.previous = previous;
      this.current = current;
   }

   public class01404 y() {
      return this.current;
   }

   public class01404 N() {
      return this.previous;
   }

   public class01404 method_48888(float var1) {
      return var1 >= 1.0 ? this.current : this.previous.N(this.current, var1);
   }
}
