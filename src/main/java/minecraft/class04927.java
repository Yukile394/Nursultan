package minecraft;

import Nursultan.class10477;
import com.viaversion.viafabricplus.injection.access.base.IEditBox;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class class04927 extends class06478 implements IEditBox {
   private static final class01883 field_45914 = new class01883(class01894.y("widget/text_field"), class01894.y("widget/text_field_highlighted"));
   public static final int field_32194 = -1;
   public static final int field_32195 = 1;
   private static final int field_32197 = 1;
   private static final String field_32199 = "_";
   public static final int field_32196 = -2039584;
   public static final class00405 field_62465 = class00405.N.N(class06541.field_1063);
   public static final class00405 field_62466 = class00405.N.N(class06541.field_1080, class06541.field_1056);
   private static final int field_45354 = 300;
   private final class01590 field_2105;
   private String field_2092;
   private int field_2108;
   private boolean field_2095;
   private boolean field_2096;
   private boolean field_2094;
   private boolean field_60437;
   private boolean field_60438;
   private boolean field_63506;
   private int field_2103;
   private int field_2102;
   private int field_2101;
   private int field_2100;
   private int field_2098;
   @Nullable
   private String field_2106;
   @Nullable
   private Consumer<String> field_2088;
   private Predicate<String> field_2104;
   private final List<class10477> field_62008;
   @Nullable
   private class00392 field_41100;
   private long field_45352;
   private int field_60435;
   private int field_60436;
   private boolean viaFabricPlus$forbiddenCharactersUnlocked = false;

   public class04927(class01590 var1, int var2, int var3, int var4, int var5, @Nullable class04927 var6, class00392 var7) {
      super(var2, var3, var4, var5, var7);
      this.field_2092 = "";
      this.field_2108 = 32;
      this.field_2095 = true;
      this.field_2096 = true;
      this.field_2094 = true;
      this.field_60437 = false;
      this.field_60438 = true;
      this.field_63506 = true;
      this.field_2100 = -2039584;
      this.field_2098 = -9408400;
      this.field_2104 = Objects::nonNull;
      this.field_62008 = new ArrayList<>();
      this.field_45352 = class07536.L();
      this.field_2105 = var1;
      if (var6 != null) {
         this.method_1852(var6.method_1882());
      }

      this.method_71504();
   }

   public class04927(class01590 var1, int var2, int var3, int var4, int var5, class00392 var6) {
      this(var1, var2, var3, var4, var5, null, var6);
   }

   public class04927(class01590 var1, int var2, int var3, class00392 var4) {
      this(var1, 0, 0, var2, var3, var4);
   }

   public void viaFabricPlus$unlockForbiddenCharacters() {
      this.viaFabricPlus$forbiddenCharactersUnlocked = true;
   }

   @Override
   public boolean method_25404(class06601 var1) {
      if (this.method_37303() && this.method_25370()) {
         switch (var1.v()) {
            case 259:
               if (this.field_2094) {
                  this.method_16873(-1, var1.P());
               }

               return true;
            case 260:
            case 264:
            case 265:
            case 266:
            case 267:
            default:
               if (var1.s()) {
                  this.method_1872(false);
                  this.method_1884(0);
                  return true;
               } else if (var1.T()) {
                  ((class06197)class06202.Nq().L_3).N(this.method_1866());
                  return true;
               } else if (var1.b()) {
                  if (this.method_20316()) {
                     this.method_1867(((class06197)class06202.Nq().L_3).N());
                  }

                  return true;
               } else {
                  if (var1.j()) {
                     ((class06197)class06202.Nq().L_3).N(this.method_1866());
                     if (this.method_20316()) {
                        this.method_1867("");
                     }

                     return true;
                  }

                  return false;
               }
            case 261:
               if (this.field_2094) {
                  this.method_16873(1, var1.P());
               }

               return true;
            case 262:
               if (var1.P()) {
                  this.method_1883(this.method_1853(1), var1.W());
               } else {
                  this.method_1855(1, var1.W());
               }

               return true;
            case 263:
               if (var1.P()) {
                  this.method_1883(this.method_1853(-1), var1.W());
               } else {
                  this.method_1855(-1, var1.W());
               }

               return true;
            case 268:
               this.method_1870(var1.W());
               return true;
            case 269:
               this.method_1872(var1.W());
               return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean method_25400(class06626 var1) {
      if (!this.method_20315()) {
         return false;
      } else if (this.redirect$dbc000$viafabricplus$allowForbiddenCharacters(var1)) {
         if (this.field_2094) {
            this.method_1867(var1.N());
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public void method_25365(boolean var1) {
      if (this.field_2096 || var1) {
         super.method_25365(var1);
         if (var1) {
            this.field_45352 = class07536.L();
         }
      }
   }

   @Override
   public void method_46419(int var1) {
      super.method_46419(var1);
      this.method_71504();
   }

   public String method_1882() {
      return this.field_2092;
   }

   @Override
   public void method_46421(int var1) {
      super.method_46421(var1);
      this.method_71504();
   }

   public void method_1852(String var1) {
      if (this.field_2104.test(var1)) {
         if (var1.length() > this.field_2108) {
            this.field_2092 = var1.substring(0, this.field_2108);
         } else {
            this.field_2092 = var1;
         }

         this.method_1872(false);
         this.method_1884(this.field_2102);
         this.method_1874(var1);
      }
   }

   public void method_1880(int var1) {
      this.field_2108 = var1;
      if (this.field_2092.length() > var1) {
         this.field_2092 = this.field_2092.substring(0, var1);
         this.method_1874(this.field_2092);
      }
   }

   private boolean redirect$dbc000$viafabricplus$allowForbiddenCharacters(class06626 var1) {
      return this.viaFabricPlus$forbiddenCharactersUnlocked || var1.y();
   }

   private String redirect$dbc000$viafabricplus$allowForbiddenCharacters(String var1) {
      return this.viaFabricPlus$forbiddenCharactersUnlocked ? var1 : class05018.M(var1);
   }

   public void method_73210(class10477 var1) {
      this.field_62008.add(var1);
   }

   public void method_1890(Predicate<String> var1) {
      this.field_2104 = var1;
   }

   public void method_1858(boolean var1) {
      this.field_2095 = var1;
      this.method_71504();
   }

   public void method_1862(boolean var1) {
      this.field_22764 = var1;
   }

   public void method_1872(boolean var1) {
      this.method_1883(this.field_2092.length(), var1);
   }

   private void method_71504() {
      if (this.field_2105 != null) {
         String s = this.field_2105.N(this.field_2092.substring(this.field_2103), this.method_1859());
         this.field_60435 = this.method_46426() + (this.method_71505() ? (this.method_25368() - this.field_2105.y(s)) / 2 : (this.field_2095 ? 4 : 0));
         this.field_60436 = this.field_2095 ? this.method_46427() + (this.field_22759 - 8) / 2 : this.method_46427();
      }
   }

   public boolean method_20315() {
      return this.method_37303() && this.method_25370() && this.method_20316();
   }

   public void method_71502(boolean var1) {
      this.field_60437 = var1;
      this.method_71504();
   }

   private class01028 method_73211(String var1, int var2) {
      Iterator<class10477> iterator = this.field_62008.iterator();

      while (iterator.hasNext()) {
         class01028 class01028 = iterator.next().format(var1, var2);
         if (class01028 != null) {
            return class01028;
         }
      }

      return class01028.a_(var1, class00405.N);
   }

   private boolean method_71505() {
      return this.field_60437;
   }

   public boolean method_1885() {
      return this.field_22764;
   }

   public boolean method_1851() {
      return this.field_2095;
   }

   public void method_1884(int var1) {
      this.field_2101 = class04995.N(var1, 0, this.field_2092.length());
      this.method_52719(this.field_2101);
   }

   private boolean method_20316() {
      return this.field_2094;
   }

   private void method_52719(int var1) {
      if (this.field_2105 != null) {
         this.field_2103 = Math.min(this.field_2103, this.field_2092.length());
         int i = this.method_1859();
         int j = this.field_2105.N(this.field_2092.substring(this.field_2103), i).length() + this.field_2103;
         if (var1 == this.field_2103) {
            this.field_2103 = this.field_2103 - this.field_2105.N(this.field_2092, i, true).length();
         }

         if (var1 > j) {
            this.field_2103 += var1 - j;
         } else if (var1 <= this.field_2103) {
            this.field_2103 = this.field_2103 - (this.field_2103 - var1);
         }

         this.field_2103 = class04995.N(this.field_2103, 0, this.field_2092.length());
      }
   }

   public int method_1889(int var1) {
      return var1 > this.field_2092.length() ? this.method_46426() : this.method_46426() + this.field_2105.y(this.field_2092.substring(0, var1));
   }

   private int method_1864(int var1, int var2, boolean var3) {
      int i = var2;
      boolean flag = var1 < 0;
      int j = Math.abs(var1);

      for (int k = 0; k < j; k++) {
         if (!flag) {
            int l = this.field_2092.length();
            i = this.field_2092.indexOf(32, i);
            if (i == -1) {
               i = l;
            } else {
               while (var3 && i < l && this.field_2092.charAt(i) == ' ') {
                  i++;
               }
            }
         } else {
            while (var3 && i > 0 && this.field_2092.charAt(i - 1) == ' ') {
               i--;
            }

            while (i > 0 && this.field_2092.charAt(i - 1) != ' ') {
               i--;
            }
         }
      }

      return i;
   }

   public void method_1867(String var1) {
      int i = Math.min(this.field_2102, this.field_2101);
      int j = Math.max(this.field_2102, this.field_2101);
      int k = this.field_2108 - this.field_2092.length() - (i - j);
      if (k > 0) {
         String s = this.redirect$dbc000$viafabricplus$allowForbiddenCharacters(var1);
         int l = s.length();
         if (k < l) {
            if (Character.isHighSurrogate(s.charAt(k - 1))) {
               k--;
            }

            s = s.substring(0, k);
            l = k;
         }

         String s1 = new StringBuilder(this.field_2092).replace(i, j, s).toString();
         if (this.field_2104.test(s1)) {
            this.field_2092 = s1;
            this.method_1875(i + l);
            this.method_1884(this.field_2102);
            this.method_1874(this.field_2092);
         }
      }
   }

   public void method_1875(int var1) {
      this.field_2102 = class04995.N(var1, 0, this.field_2092.length());
      this.method_52719(this.field_2102);
   }

   public int method_1853(int var1) {
      return this.method_1869(var1, this.method_1881());
   }

   public int method_1859() {
      return this.method_1851() ? this.field_22758 - 8 : this.field_22758;
   }

   public void method_1877(int var1) {
      if (!this.field_2092.isEmpty()) {
         if (this.field_2101 != this.field_2102) {
            this.method_1867("");
         } else {
            this.method_55506(this.method_1853(var1));
         }
      }
   }

   private int method_27537(int var1) {
      return class07536.N(this.field_2092, this.field_2102, var1);
   }

   private int method_74215(class06613 var1) {
      int i = Math.min(class04995.N(var1.n()) - this.field_60435, this.method_1859());
      String s = this.field_2092.substring(this.field_2103);
      return this.field_2103 + this.field_2105.N(s, i).length();
   }

   private void method_16873(int var1, boolean var2) {
      if (var2) {
         this.method_1877(var1);
      } else {
         this.method_1878(var1);
      }
   }

   public void method_1860(int var1) {
      this.field_2098 = var1;
   }

   private int method_1869(int var1, int var2) {
      return this.method_1864(var1, var2, true);
   }

   public void method_1855(int var1, boolean var2) {
      this.method_1883(this.method_27537(var1), var2);
   }

   public void method_75351(boolean var1) {
      this.field_63506 = var1;
   }

   public void method_1870(boolean var1) {
      this.method_1883(0, var1);
   }

   public String method_1866() {
      int i = Math.min(this.field_2102, this.field_2101);
      int j = Math.max(this.field_2102, this.field_2101);
      return this.field_2092.substring(i, j);
   }

   public void method_1883(int var1, boolean var2) {
      this.method_1875(var1);
      if (!var2) {
         this.method_1884(this.field_2102);
      }

      this.method_1874(this.field_2092);
   }

   private void method_74216(class06613 var1) {
      int i = this.method_74215(var1);
      int j = this.method_1869(-1, i);
      int k = this.method_1869(1, i);
      this.method_1883(j, false);
      this.method_1883(k, true);
   }

   public void method_1888(boolean var1) {
      this.field_2094 = var1;
   }

   public void method_1856(boolean var1) {
      this.field_2096 = var1;
   }

   public void method_1887(@Nullable String var1) {
      this.field_2106 = var1;
   }

   private void method_1874(String var1) {
      if (this.field_2088 != null) {
         this.field_2088.accept(var1);
      }

      this.method_71504();
   }

   public void method_55506(int var1) {
      if (!this.field_2092.isEmpty()) {
         if (this.field_2101 != this.field_2102) {
            this.method_1867("");
         } else {
            int i = Math.min(var1, this.field_2102);
            int j = Math.max(var1, this.field_2102);
            if (i != j) {
               String s = new StringBuilder(this.field_2092).delete(i, j).toString();
               if (this.field_2104.test(s)) {
                  this.field_2092 = s;
                  this.method_1883(i, false);
               }
            }
         }
      }
   }

   public void method_1878(int var1) {
      this.method_55506(this.method_27537(var1));
   }

   public int method_1881() {
      return this.field_2102;
   }

   public void method_71503(boolean var1) {
      this.field_60438 = var1;
   }

   public final int method_1861() {
      return this.field_2108;
   }

   public void method_1863(Consumer<String> var1) {
      this.field_2088 = var1;
   }

   public void method_1868(int var1) {
      this.field_2100 = var1;
   }

   @Override
   public void method_25348(class06613 var1, boolean var2) {
      if (var2) {
         this.method_74216(var1);
      } else {
         this.method_1883(this.method_74215(var1), var1.W());
      }
   }

   @Override
   public void method_47399(class03428 var1) {
      var1.N(class03457.field_33788, this.method_25360());
   }

   @Override
   protected void method_25349(class06613 var1, double var2, double var4) {
      this.method_1883(this.method_74215(var1), true);
   }

   @Override
   protected class05216 method_25360() {
      class00392 class00392 = this.method_25369();
      return class00392.N("gui.narrate.editBox", class00392, this.field_2092);
   }

   @Override
   public void method_25354(class09033 var1) {
   }

   @Override
   public void method_48579(class01054 var1, int var2, int var3, float var4) {
      if (this.method_1885()) {
         if (this.method_1851()) {
            class01894 class01894 = field_45914.N(this.method_37303(), this.method_25370());
            var1.N(class08394.Na, class01894, this.method_46426(), this.method_46427(), this.method_25368(), this.method_25364());
         }

         int i1 = this.field_2094 ? this.field_2100 : this.field_2098;
         int i = this.field_2102 - this.field_2103;
         String s = this.field_2105.N(this.field_2092.substring(this.field_2103), this.method_1859());
         boolean flag = i >= 0 && i <= s.length();
         boolean flag1 = this.method_25370() && (class07536.L() - this.field_45352) / 300L % 2L == 0L && flag;
         int j = this.field_60435;
         int k = class04995.N(this.field_2101 - this.field_2103, 0, s.length());
         if (!s.isEmpty()) {
            String s1 = flag ? s.substring(0, i) : s;
            class01028 class01028 = this.method_73211(s1, this.field_2103);
            var1.N(this.field_2105, class01028, j, this.field_60436, i1, this.field_60438);
            j += this.field_2105.N(class01028) + 1;
         }

         boolean flag2 = this.field_2102 < this.field_2092.length() || this.field_2092.length() >= this.method_1861();
         int j1 = j;
         if (!flag) {
            j1 = i > 0 ? this.field_60435 + this.field_22758 : this.field_60435;
         } else if (flag2) {
            j1 = j - 1;
            j--;
         }

         if (!s.isEmpty() && flag && i < s.length()) {
            var1.N(this.field_2105, this.method_73211(s.substring(i), this.field_2102), j, this.field_60436, i1, this.field_60438);
         }

         if (this.field_41100 != null && s.isEmpty() && !this.method_25370()) {
            var1.y(this.field_2105, this.field_41100, j, this.field_60436, i1);
         }

         if (!flag2 && this.field_2106 != null) {
            var1.N(this.field_2105, this.field_2106, j1 - 1, this.field_60436, -8355712, this.field_60438);
         }

         if (k != i) {
            int l = this.field_60435 + this.field_2105.y(s.substring(0, k));
            var1.N(
               Math.min(j1, this.method_46426() + this.field_22758),
               this.field_60436 - 1,
               Math.min(l - 1, this.method_46426() + this.field_22758),
               this.field_60436 + 1 + 9,
               this.field_63506
            );
         }

         if (flag1) {
            if (flag2) {
               var1.N(j1, this.field_60436 - 1, j1 + 1, this.field_60436 + 1 + 9, i1);
            } else {
               var1.N(this.field_2105, "_", j1, this.field_60436, i1, this.field_60438);
            }
         }

         if (this.method_49606()) {
            var1.N(this.method_20316() ? class06608.y : class06608.B);
         }
      }
   }

   public void method_47404(class00392 var1) {
      boolean flag = var1.method_10866().equals(class00405.N);
      this.field_41100 = (class00392)(flag ? var1.L().L(field_62465) : var1);
   }
}
