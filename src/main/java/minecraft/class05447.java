package minecraft;

import com.google.common.collect.Lists;
import com.ibm.icu.lang.UCharacter;
import com.ibm.icu.text.ArabicShaping;
import com.ibm.icu.text.Bidi;
import com.ibm.icu.text.BidiRun;
import java.util.ArrayList;

public class class05447 {
   public class05447() {
      super();
   }

   public static class01028 N(class05936 var0, boolean var1) {
      class05438 class05438 = class05438.N(var0, UCharacter::getMirror, class05447::N);
      Bidi bidi = new Bidi(class05438.N(), var1 ? 127 : 126);
      bidi.setReorderingMode(0);
      ArrayList arraylist = Lists.newArrayList();
      int i = bidi.countRuns();

      for (int j = 0; j < i; j++) {
         BidiRun bidirun = bidi.getVisualRun(j);
         arraylist.addAll(class05438.N(bidirun.getStart(), bidirun.getLength(), bidirun.isOddRun()));
      }

      return class01028.a_(arraylist);
   }

   private static String N(String var0) {
      try {
         return new ArabicShaping(8).shape(var0);
      } catch (Exception exception) {
         return var0;
      }
   }
}
