package minecraft;

import com.mojang.logging.LogUtils;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class05231 extends class05724<class05978> {
   public static final DateTimeFormatter N = class07536.N(FormatStyle.SHORT);
   static final class01894 y = class01894.y("world_list/error_highlighted");
   static final class01894 L = class01894.y("world_list/error");
   static final class01894 u = class01894.y("world_list/marked_join_highlighted");
   static final class01894 i = class01894.y("world_list/marked_join");
   static final class01894 R = class01894.y("world_list/warning_highlighted");
   static final class01894 M = class01894.y("world_list/warning");
   static final class01894 B = class01894.y("world_list/join_highlighted");
   static final class01894 Z = class01894.y("world_list/join");
   static final Logger z = LogUtils.getLogger();
   static final class00392 U = class00392.L("selectWorld.tooltip.fromNewerVersion1").N(class06541.field_1061);
   static final class00392 E = class00392.L("selectWorld.tooltip.fromNewerVersion2").N(class06541.field_1061);
   static final class00392 W = class00392.L("selectWorld.tooltip.snapshot1").N(class06541.field_1065);
   static final class00392 m = class00392.L("selectWorld.tooltip.snapshot2").N(class06541.field_1065);
   static final class00392 P = class00392.L("selectWorld.locked").N(class06541.field_1061);
   static final class00392 s = class00392.L("selectWorld.conversion.tooltip").N(class06541.field_1061);
   static final class00392 T = class00392.L("selectWorld.incompatible.tooltip").N(class06541.field_1061);
   static final class00392 b = class00392.L("selectWorld.experimental");
   private final class05096 n;
   private CompletableFuture<List<class06434>> t;
   @Nullable
   private List<class06434> G;
   private final class05942 l;
   final class05217 j;
   private String d;
   private boolean w;
   @Nullable
   private final Consumer<class06434> k;
   @Nullable
   final Consumer<class05944> v;

   public Optional<class05944> L() {
      class05978 class05978 = this.method_25334();
      return class05978 instanceof class05944 ? Optional.of((class05944)class05978) : Optional.empty();
   }

   class05231(
      class05096 var1,
      class06202 var2,
      int var3,
      int var4,
      String var5,
      @Nullable class05231 var6,
      @Nullable Consumer<class06434> var7,
      @Nullable Consumer<class05944> var8,
      class05217 var9
   ) {
      super(var2, var3, var4, 0, 36);
      this.n = var1;
      this.l = new class05942(var2);
      this.d = var5;
      this.k = var7;
      this.v = var8;
      this.j = var9;
      if (var6 != null) {
         this.t = var6.t;
      } else {
         this.t = this.Z();
      }

      this.method_25321(this.l);
      this.N(this.R());
   }

   private CompletableFuture<List<class06434>> Z() {
      class04749 class04749;
      try {
         class04749 = this.field_22740.NL().y();
      } catch (class01091 class01091) {
         z.error("Couldn't load level list", class01091);
         this.N(class01091.N());
         return CompletableFuture.completedFuture(List.of());
      }

      return this.field_22740.NL().N(class04749).exceptionally(var1x -> {
         this.field_22740.u(class07080.N(var1x, "Couldn't load level list"));
         return List.of();
      });
   }

   public class05096 i() {
      return this.n;
   }

   private void z() {
      this.method_65506();
      this.n.method_37064(true);
   }

   public void u() {
      this.y();
      this.field_22740.N(this.n);
   }

   public void y() {
      this.t = this.Z();
   }

   private void N(String var1, List<class06434> var2) {
      ArrayList arraylist = new ArrayList();
      Optional<class05944> optional = this.L();
      class05944 class05944x = null;

      for (class06434 class06434 : var2.stream().filter(var2x -> this.N(var1.toLowerCase(Locale.ROOT), var2x)).toList()) {
         class05944 class05944x = new class05944(this, this, class06434);
         if (optional.isPresent() && optional.get().z().N().equals(class05944x.z().N())) {
            class05944x = class05944x;
         }

         arraylist.add(class05944x);
      }

      this.method_73373(this.method_25396().stream().filter(var1x -> !arraylist.contains(var1x)).toList());
      arraylist.forEach(var1x -> {
         if (!this.method_25396().contains(var1x)) {
            this.method_25321(var1x);
         }
      });
      this.method_25313((class05978)class05944x);
      this.z();
   }

   private boolean N(String var1, class06434 var2) {
      return var2.y().toLowerCase(Locale.ROOT).contains(var1) || var2.N().toLowerCase(Locale.ROOT).contains(var1);
   }

   public void N(String var1) {
      if (this.G != null && !var1.equals(this.d)) {
         this.N(var1, this.G);
      }

      this.d = var1;
   }

   private void N(class00392 var1) {
      this.field_22740.N(new class06325(class00392.L("selectWorld.unable_to_load"), var1));
   }

   public void method_25313(@Nullable class05978 var1) {
      super.method_25313(var1);
      if (this.k != null) {
         this.k.accept(var1 instanceof class05944 ? ((class05944)var1).N : null);
      }
   }

   private void N(@Nullable List<class06434> var1) {
      if (var1 != null) {
         if (var1.isEmpty()) {
            switch (this.j) {
               case field_62201:
                  class05213.N(this.field_22740, () -> this.field_22740.N(null));
                  break;
               case field_62202:
                  this.method_25339();
                  this.method_25321(new class05226(class00392.L("mco.upload.select.world.none"), this.n.method_64506()));
            }
         } else {
            this.N(this.d, var1);
            this.G = var1;
         }
      }
   }

   @Nullable
   private List<class06434> R() {
      try {
         List<class06434> list = this.t.getNow(null);
         if (this.j == class05217.field_62202) {
            if (list == null || this.w) {
               return null;
            }

            this.w = true;
            list = list.stream().filter(class06434::t).toList();
         }

         return list;
      } catch (CancellationException | CompletionException completionexception) {
         return null;
      }
   }

   @Override
   public void method_47399(class03428 var1) {
      if (this.method_25396().contains(this.l)) {
         this.l.method_37020(var1);
      } else {
         super.method_47399(var1);
      }
   }

   @Override
   public void method_48579(class01054 var1, int var2, int var3, float var4) {
      List<class06434> list = this.R();
      if (list != this.G) {
         this.N(list);
      }

      super.method_48579(var1, var2, var3, var4);
   }

   @Override
   public void method_25339() {
      this.method_25396().forEach(class05978::close);
      super.method_25339();
   }

   @Override
   public int method_25322() {
      return 270;
   }
}
