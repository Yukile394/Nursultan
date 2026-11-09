package minecraft;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.Swapper;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntComparator;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import org.slf4j.Logger;

public class class00067<T> {
   private static final boolean y = Boolean.parseBoolean(System.getProperty("SuffixArray.printComparisons", "false"));
   private static final boolean L = Boolean.parseBoolean(System.getProperty("SuffixArray.printArray", "false"));
   private static final Logger u = LogUtils.getLogger();
   private static final int i = -1;
   private static final int R = -2;
   protected final List<T> N = Lists.newArrayList();
   private final IntList M = new IntArrayList();
   private final IntList B = new IntArrayList();
   private IntList Z = new IntArrayList();
   private IntList z = new IntArrayList();
   private int U;

   public class00067() {
      super();
   }

   private void y() {
      for (int ix = 0; ix < this.Z.size(); ix++) {
         u.debug("{} {}", ix, this.N(ix));
      }

      u.debug("");
   }

   public List<T> N(String var1) {
      int ix = this.Z.size();
      int j = 0;
      int k = ix;

      while (j < k) {
         int l = j + (k - j) / 2;
         int i1 = this.N(var1, l);
         if (y) {
            u.debug("comparing lower \"{}\" with {} \"{}\": {}", new Object[]{var1, l, this.N(l), i1});
         }

         if (i1 > 0) {
            j = l + 1;
         } else {
            k = l;
         }
      }

      if (j >= 0 && j < ix) {
         int i2 = j;
         k = ix;

         while (j < k) {
            int j2 = j + (k - j) / 2;
            int j1 = this.N(var1, j2);
            if (y) {
               u.debug("comparing upper \"{}\" with {} \"{}\": {}", new Object[]{var1, j2, this.N(j2), j1});
            }

            if (j1 >= 0) {
               j = j2 + 1;
            } else {
               k = j2;
            }
         }

         int k2 = j;
         IntOpenHashSet intopenhashset = new IntOpenHashSet();

         for (int k1 = i2; k1 < k2; k1++) {
            intopenhashset.add(this.Z.getInt(k1));
         }

         int[] aint = intopenhashset.toIntArray();
         Arrays.sort(aint);
         LinkedHashSet linkedhashset = Sets.newLinkedHashSet();

         for (int l1 : aint) {
            linkedhashset.add(this.N.get(l1));
         }

         return Lists.newArrayList(linkedhashset);
      } else {
         return Collections.emptyList();
      }
   }

   private int N(String var1, int var2) {
      int ix = this.B.getInt(this.Z.getInt(var2));
      int j = this.z.getInt(var2);

      for (int k = 0; k < var1.length(); k++) {
         int l = this.M.getInt(ix + j + k);
         if (l == -1) {
            return 1;
         }

         char c0 = var1.charAt(k);
         char c1 = (char)l;
         if (c0 < c1) {
            return -1;
         }

         if (c0 > c1) {
            return 1;
         }
      }

      return 0;
   }

   public void N(T var1, String var2) {
      this.U = Math.max(this.U, var2.length());
      int ix = this.N.size();
      this.N.add((T)var1);
      this.B.add(this.M.size());

      for (int j = 0; j < var2.length(); j++) {
         this.Z.add(ix);
         this.z.add(j);
         this.M.add(var2.charAt(j));
      }

      this.Z.add(ix);
      this.z.add(var2.length());
      this.M.add(-1);
   }

   private String N(int var1) {
      int ix = this.z.getInt(var1);
      int j = this.B.getInt(this.Z.getInt(var1));
      StringBuilder stringbuilder = new StringBuilder();

      for (int k = 0; j + k < this.M.size(); k++) {
         if (k == ix) {
            stringbuilder.append('^');
         }

         int l = this.M.getInt(j + k);
         if (l == -1) {
            break;
         }

         stringbuilder.append((char)l);
      }

      return stringbuilder.toString();
   }

   public void N() {
      int ix = this.M.size();
      int[] aint = new int[ix];
      int[] aint1 = new int[ix];
      int[] aint2 = new int[ix];
      int[] aint3 = new int[ix];
      IntComparator intcomparator = (var2x, var3x) -> aint1[var2x] == aint1[var3x]
         ? Integer.compare(aint2[var2x], aint2[var3x])
         : Integer.compare(aint1[var2x], aint1[var3x]);
      Swapper swapper = (var3x, var4x) -> {
         if (var3x != var4x) {
            int ixx = aint1[var3x];
            aint1[var3x] = aint1[var4x];
            aint1[var4x] = ixx;
            ixx = aint2[var3x];
            aint2[var3x] = aint2[var4x];
            aint2[var4x] = ixx;
            ixx = aint3[var3x];
            aint3[var3x] = aint3[var4x];
            aint3[var4x] = ixx;
         }
      };

      for (int j = 0; j < ix; j++) {
         aint[j] = this.M.getInt(j);
      }

      byte b0 = 1;

      for (int k = Math.min(ix, this.U); b0 * 2 < k; b0 *= 2) {
         for (int l = 0; l < ix; aint3[l] = l++) {
            aint1[l] = aint[l];
            aint2[l] = l + b0 < ix ? aint[l + b0] : -2;
         }

         it.unimi.dsi.fastutil.Arrays.quickSort(0, ix, intcomparator, swapper);

         for (int k1 = 0; k1 < ix; k1++) {
            if (k1 > 0 && aint1[k1] == aint1[k1 - 1] && aint2[k1] == aint2[k1 - 1]) {
               aint[aint3[k1]] = aint[aint3[k1 - 1]];
            } else {
               aint[aint3[k1]] = k1;
            }
         }
      }

      IntList intlist1 = this.Z;
      IntList intlist = this.z;
      this.Z = new IntArrayList(intlist1.size());
      this.z = new IntArrayList(intlist.size());

      for (int i1 = 0; i1 < ix; i1++) {
         int j1 = aint3[i1];
         this.Z.add(intlist1.getInt(j1));
         this.z.add(intlist.getInt(j1));
      }

      if (L) {
         this.y();
      }
   }
}
