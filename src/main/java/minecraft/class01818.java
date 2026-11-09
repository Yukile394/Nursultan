package minecraft;

public interface class01818 {
   void N(StringBuilder var1);

   class06069 N(int var1, int var2, int var3);

   class06069 N(long var1);

   class06069 N(String var1);

   default class06069 N(class01894 var1) {
      return this.N(var1.toString());
   }

   default class06069 N(class07209 var1) {
      return this.N(var1.method_10263(), var1.method_10264(), var1.method_10260());
   }
}
