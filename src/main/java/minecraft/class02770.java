package minecraft;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jspecify.annotations.Nullable;

public abstract class class02770 {
   private static final String N = "/\\*(?:[^*]|\\*+[^*/])*\\*+/";
   private static final String y = "//[^\\v]*";
   private static final Pattern L = Pattern.compile(
      "(#(?:/\\*(?:[^*]|\\*+[^*/])*\\*+/|\\h)*moj_import(?:/\\*(?:[^*]|\\*+[^*/])*\\*+/|\\h)*(?:\"(.*)\"|<(.*)>))"
   );
   private static final Pattern u = Pattern.compile("(#(?:/\\*(?:[^*]|\\*+[^*/])*\\*+/|\\h)*version(?:/\\*(?:[^*]|\\*+[^*/])*\\*+/|\\h)*(\\d+))\\b");
   private static final Pattern i = Pattern.compile("(?:^|\\v)(?:\\s|/\\*(?:[^*]|\\*+[^*/])*\\*+/|(//[^\\v]*))*\\z");

   public class02770() {
      super();
   }

   private static boolean N(String var0, Matcher var1, int var2) {
      if (var1.start() - var2 == 0) {
         return false;
      } else {
         Matcher matcher = i.matcher(var0.substring(var2, var1.start()));
         return !matcher.find() ? true : matcher.end(1) == var1.start();
      }
   }

   @Nullable
   public abstract String N(boolean var1, String var2);

   public static String N(String var0, class08227 var1) {
      if (var1.L()) {
         return var0;
      } else {
         int ix = var0.indexOf(10) + 1;
         return var0.substring(0, ix) + var1.y() + "#line 1 0\n" + var0.substring(ix);
      }
   }

   private static boolean N(String var0, Matcher var1) {
      return !N(var0, var1, 0);
   }

   private List<String> N(String var1, class02806 var2, String var3) {
      int ix = var2.y;
      int j = 0;
      String s = "";
      ArrayList arraylist = Lists.newArrayList();
      Matcher matcher = L.matcher(var1);

      while (matcher.find()) {
         if (!N(var1, matcher, j)) {
            String s1 = matcher.group(2);
            boolean flag = s1 != null;
            if (!flag) {
               s1 = matcher.group(3);
            }

            if (s1 != null) {
               String s2 = var1.substring(j, matcher.start(1));
               String s3 = var3 + s1;
               String s4 = this.N(flag, s3);
               if (!Strings.isNullOrEmpty(s4)) {
                  if (!class05018.u(s4)) {
                     s4 = s4 + System.lineSeparator();
                  }

                  var2.y++;
                  int k = var2.y;
                  List<String> list = this.N(s4, var2, flag ? class06290.L(s3) : "");
                  list.set(0, String.format(Locale.ROOT, "#line %d %d\n%s", 0, k, this.N(list.get(0), var2)));
                  if (!class05018.B(s2)) {
                     arraylist.add(s2);
                  }

                  arraylist.addAll(list);
               } else {
                  String s6 = flag ? String.format(Locale.ROOT, "/*#moj_import \"%s\"*/", s1) : String.format(Locale.ROOT, "/*#moj_import <%s>*/", s1);
                  arraylist.add(s + s2 + s6);
               }

               int l = class05018.L(var1.substring(0, matcher.end(1)));
               s = String.format(Locale.ROOT, "#line %d %d", l, ix);
               j = matcher.end(1);
            }
         }
      }

      String s5 = var1.substring(j);
      if (!class05018.B(s5)) {
         arraylist.add(s + s5);
      }

      return arraylist;
   }

   private String N(String var1, class02806 var2) {
      Matcher matcher = u.matcher(var1);
      if (matcher.find() && N(var1, matcher)) {
         var2.N = Math.max(var2.N, Integer.parseInt(matcher.group(2)));
         return var1.substring(0, matcher.start(1)) + "/*" + var1.substring(matcher.start(1), matcher.end(1)) + "*/" + var1.substring(matcher.end(1));
      } else {
         return var1;
      }
   }

   private String N(String var1, int var2) {
      Matcher matcher = u.matcher(var1);
      return matcher.find() && N(var1, matcher)
         ? var1.substring(0, matcher.start(2)) + Math.max(var2, Integer.parseInt(matcher.group(2))) + var1.substring(matcher.end(2))
         : var1;
   }

   public List<String> N(String var1) {
      class02806 class02806 = new class02806();
      List<String> list = this.N(var1, class02806, "");
      list.set(0, this.N(list.get(0), class02806.N));
      return list;
   }
}
