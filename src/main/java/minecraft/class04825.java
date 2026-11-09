package minecraft;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public class class04825 implements class04836 {
   private static final Map<String, List<String>> N = class07536.N(Maps.newHashMap(), var0 -> {
      var0.put("{}", Lists.newArrayList(new String[]{"DataVersion", "author", "size", "data", "entities", "palette", "palettes"}));
      var0.put("{}.data.[].{}", Lists.newArrayList(new String[]{"pos", "state", "nbt"}));
      var0.put("{}.entities.[].{}", Lists.newArrayList(new String[]{"blockPos", "pos"}));
   });
   private static final Set<String> y = Sets.newHashSet(new String[]{"{}.size.[]", "{}.data.[].{}", "{}.palette.[].{}", "{}.entities.[].{}"});
   private static final Pattern L = Pattern.compile("[A-Za-z0-9._+-]+");
   private static final String u = String.valueOf(':');
   private static final String i = String.valueOf(',');
   private static final String R = "[";
   private static final String M = "]";
   private static final String B = ";";
   private static final String Z = " ";
   private static final String z = "{";
   private static final String U = "}";
   private static final String E = "\n";
   private final String W;
   private final int m;
   private final List<String> P;
   private String s = "";

   public class04825() {
      this("    ", 0, Lists.newArrayList());
   }

   public class04825(String var1, int var2, List<String> var3) {
      super();
      this.W = var1;
      this.m = var2;
      this.P = var3;
   }

   private void y(String var1) {
      this.P.add(var1);
   }

   private void y() {
      this.P.remove(this.P.size() - 1);
   }

   protected List<String> y(class07001 var1) {
      HashSet hashset = Sets.newHashSet(var1.i());
      ArrayList arraylist = Lists.newArrayList();
      List<String> list = N.get(this.N());
      if (list != null) {
         for (String sx : list) {
            if (hashset.remove(sx)) {
               arraylist.add(sx);
            }
         }

         if (!hashset.isEmpty()) {
            hashset.stream().sorted().forEach(arraylist::add);
         }
      } else {
         arraylist.addAll(hashset);
         Collections.sort(arraylist);
      }

      return arraylist;
   }

   @Override
   public void N(class06995 var1) {
      StringBuilder stringbuilder = new StringBuilder("[").append("I").append(";");
      int[] aint = var1.M();

      for (int ix = 0; ix < aint.length; ix++) {
         stringbuilder.append(" ").append(aint[ix]);
         if (ix != aint.length - 1) {
            stringbuilder.append(i);
         }
      }

      stringbuilder.append("]");
      this.s = stringbuilder.toString();
   }

   @Override
   public void N(class07001 var1) {
      if (var1.z()) {
         this.s = "{}";
      } else {
         StringBuilder stringbuilder = new StringBuilder("{");
         this.y("{}");
         String sx = y.contains(this.N()) ? "" : this.W;
         if (!sx.isEmpty()) {
            stringbuilder.append("\n");
         }

         Iterator<String> iterator = this.y(var1).iterator();

         while (iterator.hasNext()) {
            String s1 = iterator.next();
            class07709 class07709 = var1.N(s1);
            this.y(s1);
            stringbuilder.append(Strings.repeat(sx, this.m + 1))
               .append(N(s1))
               .append(u)
               .append(" ")
               .append(new class04825(sx, this.m + 1, this.P).N(class07709));
            this.y();
            if (iterator.hasNext()) {
               stringbuilder.append(i).append(sx.isEmpty() ? " " : "\n");
            }
         }

         if (!sx.isEmpty()) {
            stringbuilder.append("\n").append(Strings.repeat(sx, this.m));
         }

         stringbuilder.append("}");
         this.s = stringbuilder.toString();
         this.y();
      }
   }

   @Override
   public void N(class07741 var1) {
      if (var1.isEmpty()) {
         this.s = "[]";
      } else {
         StringBuilder stringbuilder = new StringBuilder("[");
         this.y("[]");
         String sx = y.contains(this.N()) ? "" : this.W;
         if (!sx.isEmpty()) {
            stringbuilder.append("\n");
         }

         for (int ix = 0; ix < var1.size(); ix++) {
            stringbuilder.append(Strings.repeat(sx, this.m + 1));
            stringbuilder.append(new class04825(sx, this.m + 1, this.P).N(var1.get(ix)));
            if (ix != var1.size() - 1) {
               stringbuilder.append(i).append(sx.isEmpty() ? " " : "\n");
            }
         }

         if (!sx.isEmpty()) {
            stringbuilder.append("\n").append(Strings.repeat(sx, this.m));
         }

         stringbuilder.append("]");
         this.s = stringbuilder.toString();
         this.y();
      }
   }

   @Override
   public void N(class06997 var1) {
   }

   protected static String N(String var0) {
      return L.matcher(var0).matches() ? var0 : class07707.y(var0);
   }

   public String N() {
      return String.join(".", this.P);
   }

   @Override
   public void N(class07729 var1) {
      this.s = var1.m() + "L";
   }

   @Override
   public void N(class07720 var1) {
      this.s = String.valueOf(var1.m());
   }

   @Override
   public void N(class07730 var1) {
      this.s = var1.m() + "s";
   }

   @Override
   public void N(class07037 var1) {
      this.s = var1.m() + "b";
   }

   @Override
   public void N(class07707 var1) {
      this.s = class07707.y(var1.U());
   }

   @Override
   public void N(class07757 var1) {
      String sx = "L";
      StringBuilder stringbuilder = new StringBuilder("[").append("L").append(";");
      long[] along = var1.M();

      for (int ix = 0; ix < along.length; ix++) {
         stringbuilder.append(" ").append(along[ix]).append("L");
         if (ix != along.length - 1) {
            stringbuilder.append(i);
         }
      }

      stringbuilder.append("]");
      this.s = stringbuilder.toString();
   }

   public String N(class07709 var1) {
      var1.N(this);
      return this.s;
   }

   @Override
   public void N(class07029 var1) {
      StringBuilder stringbuilder = new StringBuilder("[").append("B").append(";");
      byte[] abyte = var1.i();

      for (int ix = 0; ix < abyte.length; ix++) {
         stringbuilder.append(" ").append(abyte[ix]).append("B");
         if (ix != abyte.length - 1) {
            stringbuilder.append(i);
         }
      }

      stringbuilder.append("]");
      this.s = stringbuilder.toString();
   }

   @Override
   public void N(class07019 var1) {
      this.s = var1.m() + "d";
   }

   @Override
   public void N(class07009 var1) {
      this.s = var1.m() + "f";
   }
}
