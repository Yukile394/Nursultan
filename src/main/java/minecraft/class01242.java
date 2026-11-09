package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Set;

public class class01242 extends class05355<class07438> {
   public class01242() {
      super();
   }

   @Override
   protected void N(class04782 var1, class07438 var2) {
      class01289<?> class01289 = var2.method_18868();
      ArrayList arraylist = Lists.newArrayList();
      Optional optional = class01289.L(class05378.B)
         .orElse(class04051.N())
         .N(var0 -> var0 instanceof class08023 || var0 instanceof class00680)
         .map(class07079.class::cast);

      for (class07438 class07438 : class01289.L(class05378.M).orElse(ImmutableList.of())) {
         if (class07438 instanceof class01238 && ((class01238)class07438).l()) {
            arraylist.add((class01238)class07438);
         }
      }

      class01289.N(class05378.c, optional);
      class01289.N(class05378.Nd, arraylist);
   }

   @Override
   public Set<class05378<?>> N() {
      return ImmutableSet.of(class05378.B, class05378.c, class05378.Nd);
   }
}
