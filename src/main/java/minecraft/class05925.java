package minecraft;

public record class05925<T>(class03347<T> type, T value) {
   public class05925(class03347<T> type, T value) {
      this.type = type;
      this.value = (T)value;
   }

   public T y() {
      return this.value;
   }

   public class03347<T> N() {
      return this.type;
   }
}
