package minecraft;

public interface class02346<S> {
   void N(int var1, class02350<S> var2, Object var3);

   default void N(int var1, Object var2) {
      this.N(var1, class02350.N(), var2);
   }

   void N(int var1);
}
