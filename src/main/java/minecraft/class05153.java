package minecraft;

import Nursultan.class10496;
import com.mojang.logging.LogUtils;
import com.mojang.text2speech.Narrator;
import org.lwjgl.util.tinyfd.TinyFileDialogs;
import org.slf4j.Logger;

public class class05153 {
   public static final class00392 N = class05220.N;
   private static final Logger y = LogUtils.getLogger();
   private final class06202 L;
   private final Narrator u = Narrator.getNarrator();

   public void L(class00392 var1) {
      if (this.u().u()) {
         this.i(var1);
      }
   }

   public void L() {
      this.u.destroy();
   }

   public class05153(class06202 var1) {
      super();
      this.L = var1;
   }

   private void i(class00392 var1) {
      String s = var1.getString();
      if (!s.isEmpty()) {
         this.y(s);
         this.N(s, false);
      }
   }

   private class01299 u() {
      return ((class05630)this.L.i_7).NV().method_41753();
   }

   public void u(class00392 var1) {
      this.N(var1.getString());
   }

   public void y() {
      if (this.u() != class01299.field_18176 && this.u.active()) {
         this.u.clear();
      }
   }

   public void y(class00392 var1) {
      if (this.u().i()) {
         this.i(var1);
      }
   }

   private void y(String var1) {
      if (class07529.ND) {
         y.debug("Narrating: {}", var1.replaceAll("\n", "\\\\n"));
      }
   }

   public void N(class01299 var1) {
      this.y();
      this.N(class00392.L("options.narrator").i(" : ").y(var1.y()).getString(), true);
      class06086 class06086 = class06202.Nq().m();
      if (this.u.active()) {
         if (var1 == class01299.field_18176) {
            class06132.y(class06086, class06095.N, class00392.L("narrator.toast.disabled"), null);
         } else {
            class06132.y(class06086, class06095.N, class00392.L("narrator.toast.enabled"), var1.y());
         }
      } else {
         class06132.y(class06086, class06095.N, class00392.L("narrator.toast.disabled"), class00392.L("options.narrator.notavailable"));
      }
   }

   public void N(class00392 var1) {
      if (this.u().L()) {
         this.i(var1);
      }
   }

   public void N(boolean var1) {
      if (var1
         && !this.N()
         && !TinyFileDialogs.tinyfd_messageBox(
            "Minecraft",
            "Failed to initialize text-to-speech library. Do you want to continue?\nIf this problem persists, please report it at bugs.mojang.com",
            "yesno",
            "error",
            true
         )) {
         throw new class10496("Narrator library is not active");
      }
   }

   public boolean N() {
      return this.u.active();
   }

   private void N(String var1, boolean var2) {
      this.u.say(var1, var2, ((class05630)this.L.i_7).N(class04911.field_15246));
   }

   public void N(String var1) {
      if (this.u().u() && !var1.isEmpty()) {
         this.y(var1);
         if (this.u.active()) {
            this.u.clear();
            this.N(var1, true);
         }
      }
   }
}
