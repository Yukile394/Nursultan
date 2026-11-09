package minecraft;

public interface class02465<T> extends class02500 {
   class02477<T> y();

   @Override
   default boolean N(class02666 var1) {
      Object object = var1.method_58694(this.y());
      return object != null && this.N((T)object);
   }

   boolean N(T var1);
}
