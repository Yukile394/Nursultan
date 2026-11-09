package minecraft;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2LongMap;
import java.io.BufferedWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.slf4j.Logger;

public class class04640 implements class04681 {
   private static final Logger N = LogUtils.getLogger();
   private static final class05985 L = new class04670();
   private static final Splitter u = Splitter.on('\u001e');
   private static final Comparator<Entry<String, class04642>> i = Entry.<String, class04642>comparingByValue(Comparator.comparingLong(var0 -> var0.y))
      .reversed();
   private final Map<String, ? extends class05985> R;
   private final long M;
   private final int B;
   private final long Z;
   private final int z;
   private final int U;

   @Override
   public long L() {
      return this.Z;
   }

   private class05985 L(String var1) {
      class05985 class05985 = this.R.get(var1);
      return class05985 != null ? class05985 : L;
   }

   public class04640(Map<String, ? extends class05985> var1, long var2, int var4, long var5, int var7) {
      super();
      this.R = var1;
      this.M = var2;
      this.B = var4;
      this.Z = var5;
      this.z = var7;
      this.U = var7 - var4;
   }

   private Map<String, class04642> B() {
      TreeMap treemap = Maps.newTreeMap();
      this.R.forEach((var1x, var2) -> {
         Object2LongMap<String> object2longmap = var2.u();
         if (!object2longmap.isEmpty()) {
            List<String> list = u.splitToList(var1x);
            object2longmap.forEach((var2x, var3x) -> treemap.computeIfAbsent(var2x, var0xx -> new class04642()).N(list.iterator(), var3x));
         }
      });
      return treemap;
   }

   @Override
   public String i() {
      StringBuilder stringbuilder = new StringBuilder();
      this.N(0, "root", stringbuilder);
      return stringbuilder.toString();
   }

   @Override
   public int u() {
      return this.z;
   }

   @Override
   public int y() {
      return this.B;
   }

   private static StringBuilder N(StringBuilder var0, int var1) {
      var0.append(String.format(Locale.ROOT, "[%02d] ", var1));

      for (int ix = 0; ix < var1; ix++) {
         var0.append("|   ");
      }

      return var0;
   }

   @Override
   public long N() {
      return this.M;
   }

   protected String N(long var1, int var3) {
      StringBuilder stringbuilder = new StringBuilder();
      class02587.y.N(stringbuilder, List.of());
      stringbuilder.append("Version: ").append(class07529.y().comp_4024()).append('\n');
      stringbuilder.append("Time span: ").append(var1 / 1000000L).append(" ms\n");
      stringbuilder.append("Tick span: ").append(var3).append(" ticks\n");
      stringbuilder.append("// This is approximately ")
         .append(String.format(Locale.ROOT, "%.2f", var3 / ((float)var1 / 1.0E9F)))
         .append(" ticks per second. It should be ")
         .append(20)
         .append(" ticks per second\n\n");
      stringbuilder.append("--- BEGIN PROFILE DUMP ---\n\n");
      this.N(0, "root", stringbuilder);
      stringbuilder.append("--- END PROFILE DUMP ---\n\n");
      Map<String, class04642> map = this.B();
      if (!map.isEmpty()) {
         stringbuilder.append("--- BEGIN COUNTER DUMP ---\n\n");
         this.N(map, stringbuilder, var3);
         stringbuilder.append("--- END COUNTER DUMP ---\n\n");
      }

      return stringbuilder.toString();
   }

   @Override
   public boolean N(Path var1) {
      BufferedWriter bufferedwriter = null;

      boolean flag;
      try {
         Files.createDirectories(var1.getParent());
         bufferedwriter = Files.newBufferedWriter(var1, StandardCharsets.UTF_8);
         bufferedwriter.write(this.N(this.M(), this.R()));
         return true;
      } catch (Throwable throwable) {
         N.error("Could not save profiler results to {}", var1, throwable);
         flag = false;
      } finally {
         IOUtils.closeQuietly(bufferedwriter);
      }

      return flag;
   }

   private static boolean N(String var0, String var1) {
      return var1.length() > var0.length() && var1.startsWith(var0) && var1.indexOf(30, var0.length() + 1) < 0;
   }

   @Override
   public List<class05005> N(String var1) {
      String s = var1;
      long ix = this.L("root").N();
      class05985 class05985x = this.L(var1);
      long j = class05985x.N();
      long k = class05985x.L();
      ArrayList arraylist = Lists.newArrayList();
      if (!var1.isEmpty()) {
         var1 = var1 + "\u001e";
      }

      long l = 0L;

      for (String var15 : this.R.keySet()) {
         if (N(var1, var15)) {
            l += this.L(var15).N();
         }
      }

      float f = (float)l;
      if (l < j) {
         l = j;
      }

      if (ix < l) {
         ix = l;
      }

      for (String s2 : this.R.keySet()) {
         if (N(var1, s2)) {
            class05985 class05985x = this.L(s2);
            long i1 = class05985x.N();
            double d0 = i1 * 100.0 / l;
            double d1 = i1 * 100.0 / ix;
            String s3 = s2.substring(var1.length());
            arraylist.add(new class05005(s3, d0, d1, class05985x.L()));
         }
      }

      if ((float)l > f) {
         arraylist.add(new class05005("unspecified", ((float)l - f) * 100.0 / l, ((float)l - f) * 100.0 / ix, k));
      }

      Collections.sort(arraylist);
      arraylist.add(0, new class05005(s, 100.0, l * 100.0 / ix, k));
      return arraylist;
   }

   private void N(Map<String, class04642> var1, StringBuilder var2, int var3) {
      var1.forEach((var3x, var4) -> {
         var2.append("-- Counter: ").append(var3x).append(" --\n");
         this.N(0, "root", var4.L.get("root"), var3, var2);
         var2.append("\n\n");
      });
   }

   private void N(int var1, String var2, class04642 var3, int var4, StringBuilder var5) {
      N(var5, var1)
         .append(var2)
         .append(" total:")
         .append(var3.N)
         .append('/')
         .append(var3.y)
         .append(" average: ")
         .append(var3.N / var4)
         .append('/')
         .append(var3.y / var4)
         .append('\n');
      var3.L.entrySet().stream().sorted(i).forEach(var4x -> this.N(var1 + 1, var4x.getKey(), var4x.getValue(), var4, var5));
   }

   private void N(int var1, String var2, StringBuilder var3) {
      List<class05005> list = this.N(var2);
      ((class05985)ObjectUtils.firstNonNull(new class05985[]{this.R.get(var2), L}))
         .u()
         .forEach((var3x, var4x) -> N(var3, var1).append('#').append(var3x).append(' ').append(var4x).append('/').append(var4x / this.U).append('\n'));
      if (list.size() >= 3) {
         for (int ix = 1; ix < list.size(); ix++) {
            class05005 class05005 = list.get(ix);
            N(var3, var1)
               .append(class05005.u)
               .append('(')
               .append(class05005.L)
               .append('/')
               .append(String.format(Locale.ROOT, "%.0f", (float)class05005.L / this.U))
               .append(')')
               .append(" - ")
               .append(String.format(Locale.ROOT, "%.2f", class05005.N))
               .append("%/")
               .append(String.format(Locale.ROOT, "%.2f", class05005.y))
               .append("%\n");
            if (!"unspecified".equals(class05005.u)) {
               try {
                  this.N(var1 + 1, var2 + "\u001e" + class05005.u, var3);
               } catch (Exception exception) {
                  var3.append("[[ EXCEPTION ").append(exception).append(" ]]");
               }
            }
         }
      }
   }

   @Override
   public int R() {
      return this.U;
   }
}
