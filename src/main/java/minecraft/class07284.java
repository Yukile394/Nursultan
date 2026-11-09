package minecraft;

import org.jspecify.annotations.Nullable;

public interface class07284 extends class01011, class05487, class08713 {
   void method_32888(class03556<class01194> var1, class06889 var2, class01164 var3);

   @Nullable
   class02796 method_8503();

   void method_8406(class07126 var1, double var2, double var4, double var6, double var8, double var10, double var12);

   default class07086 y() {
      return this.method_8401().s();
   }

   default void N(@Nullable class07049 var1, class03556<class01194> var2, class07209 var3) {
      this.N(var2, var3, new class01164(var1, null));
   }

   default void N(class03556<class01194> var1, class07209 var2, class01164 var3) {
      this.method_32888(var1, class06889.y(var2), var3);
   }

   default void N(@Nullable class07049 var1, class07209 var2, class04891 var3, class04911 var4) {
      this.method_8396(var1, var2, var3, var4, 1.0F, 1.0F);
   }

   default void N(int var1, class07209 var2, int var3) {
      this.method_8444(null, var1, var2, var3);
   }

   default void N(@Nullable class07049 var1, class03556<class01194> var2, class06889 var3) {
      this.method_32888(var2, var3, new class01164(var1, null));
   }

   default long N() {
      return this.method_8401().y();
   }

   default void N(class05946<class01194> var1, class07209 var2, class01164 var3) {
      this.N(this.method_30349().L(class04227.c).y(var1), var2, var3);
   }

   @Override
   default <T> class04309<T> N(class07209 var1, T var2, int var3) {
      return new class04309<>((T)var2, var1, this.N() + var3, this.method_39224());
   }

   @Override
   default <T> class04309<T> N(class07209 var1, T var2, int var3, class00763 var4) {
      return new class04309<>((T)var2, var1, this.N() + var3, var4, this.method_39224());
   }

   @Override
   default boolean N(int var1, int var2) {
      return this.method_8398().L(var1, var2);
   }

   default void method_8408(class07209 var1, class00891 var2) {
   }

   void method_8444(@Nullable class07049 var1, int var2, class07209 var3, int var4);

   class05087 method_8401();

   class00558 method_8398();

   void method_8396(@Nullable class07049 var1, class07209 var2, class04891 var3, class04911 var4, float var5, float var6);

   default void method_42308(class07211 var1, class07209 var2, class07209 var3, class00500 var4, int var5, int var6) {
      class04376.N(this, var1, var2, var3, var4, var5, var6 - 1);
   }

   long method_39224();

   class06069 method_8409();
}
