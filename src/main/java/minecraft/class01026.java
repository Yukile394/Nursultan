package minecraft;

@FunctionalInterface
public interface class01026 {
   void onTransition(class07049 var1);

   default class01026 N(class01026 var1) {
      return var2 -> {
         this.onTransition(var2);
         var1.onTransition(var2);
      };
   }
}
