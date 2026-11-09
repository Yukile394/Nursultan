package minecraft;

import Nursultan.class10575;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.SortedMap;
import jerozgen.languagereload.LanguageReload;
import jerozgen.languagereload.access.ILanguageOptionsScreen;
import jerozgen.languagereload.gui.LanguageEntry;
import jerozgen.languagereload.gui.LanguageListWidget;
import jerozgen.languagereload.mixin.LanguageManagerAccessor;
import jerozgen.languagereload.mixin.LanguageSelectionListWidgetAccessor;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class06279 extends class05914 implements ILanguageOptionsScreen {
   private static final class00392 y = class00392.L("options.languageAccuracyWarning").y(-4539718);
   private static final int L = 53;
   private static final class00392 u = class00392.L("gui.language.search").L(class04927.field_62466);
   private static final int i = 15;
   final class08396 N;
   private class06324 R;
   @Nullable
   private class04927 M;
   private LanguageListWidget B;
   private LanguageListWidget Z;
   private class04927 z;
   private final LinkedList U = new LinkedList();
   private final Map E = new LinkedHashMap();

   private void L(CallbackInfo var1) {
      if (this.field_22787 != null) {
         this.field_22787.N(this.field_21335);
         String s = (String)this.U.peekFirst();
         if (s == null) {
            LanguageReload.setLanguage(null);
         } else {
            LinkedList linkedlist = new LinkedList(this.U);
            linkedlist.removeFirst();
            LanguageReload.setLanguage(s, linkedlist);
         }

         var1.cancel();
      }
   }

   private void L() {
      this.Z.set(this.U.stream().map(this.E::get).filter(Objects::nonNull));
      this.B.set(this.E.values().stream().filter(var1 -> {
         if (this.Z.method_25396().contains(var1)) {
            return false;
         } else {
            String s = this.z.method_1882().toLowerCase(Locale.ROOT);
            String s1 = var1.getCode().toLowerCase(Locale.ROOT);
            String s2 = var1.getLanguage().N().getString().toLowerCase(Locale.ROOT);
            return s1.contains(s) || s2.contains(s);
         }
      }));
   }

   public class06279(class05096 var1, class05630 var2, class08396 var3) {
      super(var1, var2, class00392.L("options.language.title"));
      this.N = var3;
      this.field_49503.N(53);
      this.N(var1, var2, var3, null);
   }

   public void u() {
      this.method_48263(class02106.N(this.z, this));
   }

   protected void y(CallbackInfo var1) {
      super.method_48640();
      int ix = Math.min(this.field_22789 / 2 - 4, 200);
      this.B.method_57712(ix, this.field_49503);
      this.Z.method_57712(ix, this.field_49503);
      this.B.method_46421(this.field_22789 / 2 - 4 - ix);
      this.Z.method_46421(this.field_22789 / 2 + 4);
      this.B.method_65506();
      this.Z.method_65506();
      var1.cancel();
   }

   class06279 y() {
      return this;
   }

   void N(class05096 var1, class05630 var2, class08396 var3, CallbackInfo var4) {
      this.U.addAll(LanguageReload.getLanguages());
      SortedMap<String, class08430> sortedmap = var3.y();
      if (sortedmap.isEmpty()) {
         class08430 class08430 = LanguageManagerAccessor.languagereload_getEnglishUs();
         this.E.put("en_us", new LanguageEntry(this::L, "en_us", class08430, this.U));
      } else {
         sortedmap.forEach((var1x, var2x) -> this.E.put(var1x, new LanguageEntry(this::L, var1x, var2x, this.U)));
      }

      this.field_49503.y(48);
      this.field_49503.N(53);
   }

   void N(CallbackInfo var1) {
      this.R = LanguageSelectionListWidgetAccessor.languagereload_init(this.y(), this.field_22787);
      int ix = Math.min(this.field_22789 / 2 - 4, 200);
      this.B = new LanguageListWidget(this.field_22787, this.y(), ix, this.field_22790, class00392.L("pack.available.title"));
      this.Z = new LanguageListWidget(this.field_22787, this.y(), ix, this.field_22790, class00392.L("pack.selected.title"));
      this.B.method_46421(this.field_22789 / 2 - 4 - ix);
      this.Z.method_46421(this.field_22789 / 2 + 4);
      this.field_49503.L(this.B);
      this.field_49503.L(this.Z);
      this.L();
      var1.cancel();
   }

   void N() {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.L(callbackinfo);
      if (!callbackinfo.isCancelled()) {
         if (this.R != null && this.R.method_25334() instanceof class06280 class06280 && !class06280.N.equals(this.N.N())) {
            this.N.N(class06280.N);
            this.field_21336.Nk = class06280.N;
            this.field_22787.yy();
         }

         this.field_22787.N(this.field_21335);
      }
   }

   @Override
   public void method_56131() {
      this.u();
   }

   @Override
   public void method_48640() {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.y(callbackinfo);
      if (!callbackinfo.isCancelled()) {
         super.method_48640();
         if (this.R != null) {
            this.R.method_57712(this.field_22789, this.field_49503);
         }
      }
   }

   @Override
   protected boolean method_72798() {
      return !(this.field_21335 instanceof class03263);
   }

   @Override
   protected void method_60325() {
   }

   @Override
   protected void method_60329() {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(callbackinfo);
      if (!callbackinfo.isCancelled()) {
         this.R = this.field_49503.L(new class06324(this, this.field_22787));
      }
   }

   @Override
   public void method_57732() {
      this.z = new class10575(this, this.field_22793, this.field_22789 / 2 - 100, 22, 200, 20, this.z, class00392.i());
      this.z.method_1863(var1x -> this.L());
      class01885 class01885 = this.field_49503.N(class01885.u().N(5));
      class01885.L().y();
      class01885.N(new class02071(this.field_22785, this.field_22793));
      class01885.N(this.z);
   }

   @Override
   protected void method_31387() {
      class01885 class01885x = this.field_49503.y(class01885.u()).N(8);
      class01885x.L().y();
      class01885x.N(new class02071(y, this.field_22793));
      class01885 class01885x = class01885x.N(class01885.i().N(8));
      class01885x.N(class05362.method_46430(class00392.L("options.font"), var1x -> this.field_22787.N(new class02291(this, this.field_21336))).N());
      class01885x.N(class05362.method_46430(class05220.u, var1x -> this.N()).N());
   }

   public void languagereload_focusList(LanguageListWidget var1) {
      this.method_48263(class02106.N(var1, this));
   }

   public void languagereload_focusEntry(LanguageEntry var1) {
      this.method_48263(class02106.N(var1, var1.getParent(), this));
   }
}
