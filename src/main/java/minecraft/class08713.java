package minecraft;

public interface class08713 {
   default void N(class07209 var1, class00891 var2, int var3, class00763 var4) {
      this.method_8397().N(this.N(var1, (class00891)var2, var3, var4));
   }

   default void N(class07209 var1, class00891 var2, int var3) {
      this.method_8397().N(this.N(var1, (class00891)var2, var3));
   }

   default void N(class07209 var1, class04651 var2, int var3, class00763 var4) {
      this.method_8405().N(this.N(var1, (class04651)var2, var3, var4));
   }

   default void N(class07209 var1, class04651 var2, int var3) {
      this.method_8405().N(this.N(var1, (class04651)var2, var3));
   }

   <T> class04309<T> N(class07209 var1, T var2, int var3, class00763 var4);

   <T> class04309<T> N(class07209 var1, T var2, int var3);

   class04298<class00891> method_8397();

   class04298<class04651> method_8405();
}
