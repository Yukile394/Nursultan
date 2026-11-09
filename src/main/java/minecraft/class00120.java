package minecraft;

class class00120 implements class00105<class09013> {
   class00120() {
      super();
   }

   public class02102 N(class00134<?> var1, class09013 var2) {
      if (var2.L().isPresent()) {
         class09022 class09022 = var2.L().get();
         class01885 class01885 = class01885.i().N(2);
         class01885.L().i();
         class00125 class00125 = new class00125(class06202.Nq(), 0, 0, var2.R(), var2.M(), class05220.N, var2.y(), var2.u(), var2.i());
         class01885.N(class00125);
         class01885.N(
            class02091.N(class09022.y(), var1.method_64506()).N(class09022.L()).N(false).N(class02086.field_62119).N().N(var1x -> class00103.N(var1, var1x))
         );
         return class01885;
      } else {
         return new class00125(class06202.Nq(), 0, 0, var2.R(), var2.M(), var2.y().d(), var2.y(), var2.u(), var2.i());
      }
   }
}
