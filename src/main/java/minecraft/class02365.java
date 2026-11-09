package minecraft;

record class02365<B, V, T>(class02362<? super B, ? extends V> serializer, T type) {

   class02365(class02362<? super B, ? extends V> serializer, T type) {
      super();
      this.serializer = serializer;
      this.type = (T)type;
   }

   public T y() {
      return this.type;
   }

   public class02362<? super B, ? extends V> N() {
      return this.serializer;
   }
}
