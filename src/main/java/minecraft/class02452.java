package minecraft;

public interface class02452<T> {
   class02452<?> u = () -> {
      throw new IllegalStateException("Cannot dereference handle with no underlying resource");
   };

   T get();

   static <T> class02452<T> N() {
      return (class02452<T>)u;
   }
}
