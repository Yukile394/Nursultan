package minecraft;

import java.util.function.UnaryOperator;

public class class05387 {
   public class05387() {
      super();
   }

   public static class01894 y(String var0) {
      return class01894.y("item/" + var0);
   }

   public static class01894 N(class00891 var0) {
      return class04206.i.y(var0).R("block/");
   }

   public static class01894 N(class06581 var0, String var1) {
      return class04206.B.y(var0).N((UnaryOperator<String>)(var1x -> "item/" + var1x + var1));
   }

   public static class01894 N(class06581 var0) {
      return class04206.B.y(var0).R("item/");
   }

   @Deprecated
   public static class01894 N(String var0) {
      return class01894.y("block/" + var0);
   }

   public static class01894 N(class00891 var0, String var1) {
      return class04206.i.y(var0).N((UnaryOperator<String>)(var1x -> "block/" + var1x + var1));
   }
}
