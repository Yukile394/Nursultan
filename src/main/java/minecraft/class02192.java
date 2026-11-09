package minecraft;

import Nursultan.class09647;
import Nursultan.class09653;
import Nursultan.class09654;
import Nursultan.class09656;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Optional;

public class class02192 {
   public class02192() {
      super();
   }

   public static <T, C, P> class02169<List<T>> N(class02168<T, C, P> var0) {
      class02353 class02353xxxxxxxxxxxxx = class02353.N("top");
      class02353 class02353x = class02353.N("type");
      class02353 class02353xx = class02353.N("any_type");
      class02353 class02353xxx = class02353.N("element_type");
      class02353 class02353xxxx = class02353.N("tag_type");
      class02353 class02353xxxxx = class02353.N("conditions");
      class02353 class02353xxxxxx = class02353.N("alternatives");
      class02353 class02353xxxxxxx = class02353.N("term");
      class02353 class02353xxxxxxxx = class02353.N("negation");
      class02353 class02353xxxxxxxxx = class02353.N("test");
      class02353 class02353xxxxxxxxxx = class02353.N("component_type");
      class02353 class02353xxxxxxxxxxx = class02353.N("predicate_type");
      class02353 class02353xxxxxxxxxxxx = class02353.N("id");
      class02353 class02353xxxxxxxxxxxxx = class02353.N("tag");
      class02344 class02344 = new class02344();
      class08501 class08501x = class02344.N(class02353xxxxxxxxxxxx, class02196.N);
      class08501 class08501x = class02344.N(
         class02353xxxxxxxxxxxxx,
         class02315.y(
            class02315.N(class02344.L(class02353x), class02179.N('['), class02315.L(), class02315.N(class02344.L(class02353xxxxx)), class02179.N(']')),
            class02344.L(class02353x)
         ),
         var2x -> {
            Builder builder = ImmutableList.builder();
            var2x.<Optional>y(class02353xxxxxxxxxxxx).ifPresent(builder::add);
            List list = var2x.N(class02353xxxxxxxx);
            if (list != null) {
               builder.addAll(list);
            }

            return builder.build();
         }
      );
      class02344.N(
         class02353x,
         class02315.y(class02344.L(class02353xxx), class02315.N(class02179.N('#'), class02315.L(), class02344.L(class02353xxxx)), class02344.L(class02353xx)),
         var2x -> Optional.ofNullable(var2x.y(class02353xxxxxxxxxx, class02353xxxxxxxxx))
      );
      class02344.N(class02353xx, class02179.N('*'), var0x -> class06244.field_17274);
      class02344.N(class02353xxx, new class09653<>(class08501x, var0));
      class02344.N(class02353xxxx, new class09647<>(class08501x, var0));
      class02344.N(
         class02353xxxxx,
         class02315.N(class02344.L(class02353xxxxxx), class02315.N(class02315.N(class02179.N(','), class02344.L(class02353xxxxx)))),
         var3x -> {
            Object object = var0.y(var3x.y(class02353xxxxxxx));
            return Optional.ofNullable((List)var3x.N(class02353xxxxxxxx)).map(var1xx -> class07536.N(object, (List<Object>)var1xx)).orElse(List.of(object));
         }
      );
      class02344.N(
         class02353xxxxxx,
         class02315.N(class02344.L(class02353xxxxxxx), class02315.N(class02315.N(class02179.N('|'), class02344.L(class02353xxxxxx)))),
         var2x -> {
            Object object = var2x.y(class02353xxxxxx);
            return Optional.ofNullable((List)var2x.N(class02353xxxxxxx)).map(var1xx -> class07536.N(object, (List<Object>)var1xx)).orElse(List.of(object));
         }
      );
      class02344.N(
         class02353xxxxxxx,
         class02315.y(class02344.L(class02353xxxxxxxxx), class02315.N(class02179.N('!'), class02344.L(class02353xxxxxxxx))),
         var2x -> var2x.L(class02353xxxx, class02353xxxxx)
      );
      class02344.N(class02353xxxxxxxx, class02344.L(class02353xxxxxxxxx), var2x -> var0.N(var2x.y(class02353xxxx)));
      class02344.N(
         class02353xxxxxxxxx,
         class02315.y(
            class02315.N(class02344.L(class02353xxxxxxxxxx), class02179.N('='), class02315.L(), class02344.L(class02353xxxxxxxxxxxxx)),
            class02315.N(class02344.L(class02353xxxxxxxxxxx), class02179.N('~'), class02315.L(), class02344.L(class02353xxxxxxxxxxxxx)),
            class02344.L(class02353xxxxxxxxxx)
         ),
         var4x -> {
            class02332 class02332 = var4x.N();
            Object object = class02332.N(class02353xx);

            try {
               if (object != null) {
                  Dynamic dynamic1 = class02332.y(class02353);
                  return var0.N((ImmutableStringReader)var4x.R(), object, dynamic1);
               } else {
                  Object object1 = class02332.y(class02353xxx);
                  Dynamic dynamic = class02332.N(class02353);
                  return dynamic != null ? var0.y((ImmutableStringReader)var4x.R(), object1, dynamic) : var0.N((ImmutableStringReader)var4x.R(), object1);
               }
            } catch (CommandSyntaxException commandsyntaxexception) {
               var4x.y().N(var4x.M(), commandsyntaxexception);
               return null;
            }
         }
      );
      class02344.N(class02353xxxxxxxxxx, new class09656<>(class08501x, var0));
      class02344.N(class02353xxxxxxxxxxx, new class09654<>(class08501x, var0));
      class02344.N(class02353xxxxxxxxxxxxx, new class02190(class07713.N));
      return new class02169<>(class02344, class08501x);
   }
}
