package minecraft;

record class07599<T>(class07586 easing, T fromValue, int fromTicks, T toValue, int toTicks) {

   public int L() {
      return this.fromTicks;
   }

   public class07599(class07606<T> var1, class07581<T> var2, int var3, class07581<T> var4, int var5) {
      this(var1.y(), (T)var2.y(), var3, (T)var4.y(), var5);
   }

   class07599(class07586 easing, T fromValue, int fromTicks, T toValue, int toTicks) {
      super();
      this.easing = easing;
      this.fromValue = (T)fromValue;
      this.fromTicks = fromTicks;
      this.toValue = (T)toValue;
      this.toTicks = toTicks;
   }

   public int i() {
      return this.toTicks;
   }

   public T u() {
      return this.toValue;
   }

   public T y() {
      return this.fromValue;
   }

   public class07586 N() {
      return this.easing;
   }
}
