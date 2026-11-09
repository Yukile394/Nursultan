package minecraft;

import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import net.fabricmc.fabric.api.attachment.v1.AttachmentType;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentChange;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentTargetInfo;
import org.jspecify.annotations.Nullable;

public class class00548 extends class07361 {
   private final class00570 W;
   private final boolean m;

   private class07830 L(class07830 var1) {
      if (var1 == class07830.field_13194) {
         return class07830.field_13202;
      } else {
         return var1 == class07830.field_13195 ? class07830.field_13200 : var1;
      }
   }

   @Override
   public Map<class04748, class04932> M() {
      return this.W.M();
   }

   @Override
   public class04327<class00891> P() {
      return this.m ? this.W.P() : class04295.N();
   }

   @Override
   public boolean T() {
      return false;
   }

   @Override
   public class00500 method_8320(class07209 var1) {
      return this.W.method_8320(var1);
   }

   @Override
   public class04688 method_8316(class07209 var1) {
      return this.W.method_8316(var1);
   }

   public class00548(class00570 var1, boolean var2) {
      super(var1.R(), class07371.N, var1.U, var1.J().method_74142(), var1.v());
      this.W = var1;
      this.m = var2;
   }

   @Override
   public Map<class04748, LongSet> B() {
      return this.W.B();
   }

   public class00570 I() {
      return this.W;
   }

   @Override
   public void Z() {
      this.W.Z();
   }

   @Nullable
   @Override
   public class07001 i(class07209 var1) {
      return this.W.i(var1);
   }

   @Override
   public class04327<class04651> s() {
      return this.m ? this.W.s() : class04295.N();
   }

   @Override
   public void k() {
      this.W.k();
   }

   @Override
   public boolean t() {
      return this.W.t();
   }

   @Override
   public class03322 g() {
      if (this.m) {
         return super.g();
      } else {
         throw (UnsupportedOperationException)class07536.y(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Nullable
   @Override
   public class03032 v() {
      return this.W.v();
   }

   @Override
   public boolean U() {
      return false;
   }

   @Override
   public boolean z() {
      return false;
   }

   @Override
   public void u(class07209 var1) {
   }

   @Override
   public class00554[] u() {
      return this.W.u();
   }

   @Override
   public void y(Map<class04748, LongSet> var1) {
   }

   @Override
   public LongSet y(class04748 var1) {
      return this.W.y(var1);
   }

   @Override
   public class00554 y(int var1) {
      return this.m ? this.W.y(var1) : super.y(var1);
   }

   @Override
   public class00549 E() {
      return this.W.E();
   }

   @Override
   public void N(class00549 var1) {
      if (this.m) {
         super.N(var1);
      }
   }

   @Override
   public class08094 N(long var1) {
      return this.W.N(var1);
   }

   @Nullable
   @Override
   public class07001 N(class07209 var1, class01929 var2) {
      return this.W.N(var1, var2);
   }

   @Override
   public void N(Predicate<class00500> var1, BiConsumer<class07209, class00500> var2) {
      this.W.N(var1, var2);
   }

   @Override
   public void N_86(Map<class04748, class04932> var1) {
   }

   @Nullable
   @Override
   public class00500 N(class07209 var1, class00500 var2, int var3) {
      return this.m ? this.W.N(var1, var2, var3) : null;
   }

   @Override
   public void N(class00394 var1) {
      if (this.m) {
         this.W.N(var1);
      }
   }

   @Override
   public void N(boolean var1) {
      this.W.N(var1);
   }

   @Override
   public void N(class07049 var1) {
      if (this.m) {
         this.W.N(var1);
      }
   }

   @Override
   public int N(class07830 var1, int var2, int var3) {
      return this.W.N(this.L(var1), var2, var3);
   }

   @Override
   public void N(class04330 var1, class03222 var2) {
      if (this.m) {
         this.W.N(var1, var2);
      }
   }

   @Nullable
   @Override
   public class04932 N(class04748 var1) {
      return this.W.N(var1);
   }

   @Override
   public void N(class04748 var1, class04932 var2) {
   }

   @Override
   public void N(class04748 var1, long var2) {
   }

   @Override
   public void N(class07830 var1, long[] var2) {
   }

   @Override
   public void N(class07001 var1) {
   }

   @Override
   public class07841 N(class07830 var1) {
      return this.W.N(var1);
   }

   @Override
   public void N(class07209 var1) {
   }

   @Override
   public class07321 R() {
      return this.W.R();
   }

   @Override
   public class03322 O() {
      if (this.m) {
         return super.O();
      } else {
         throw (UnsupportedOperationException)class07536.y(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public class03480 Y() {
      return this.W.Y();
   }

   @Override
   public AttachmentTargetInfo fabric_getSyncTargetInfo() {
      return this.W.fabric_getSyncTargetInfo();
   }

   @Override
   public Map fabric_getAttachments() {
      return this.W.fabric_getAttachments();
   }

   @Override
   public boolean fabric_shouldTryToSync() {
      return this.W.fabric_shouldTryToSync();
   }

   @Override
   public void fabric_markChanged(AttachmentType var1) {
      this.W.fabric_markChanged(var1);
   }

   @Override
   public boolean hasAttached(AttachmentType var1) {
      return this.W.hasAttached(var1);
   }

   @Nullable
   @Override
   public Object setAttached(AttachmentType var1, @Nullable Object var2) {
      return this.W.setAttached(var1, var2);
   }

   public void fabric_syncChange(AttachmentType var1, AttachmentChange var2) {
      this.W.fabric_syncChange(var1, var2);
   }

   @Nullable
   @Override
   public Object getAttached(AttachmentType var1) {
      return this.W.getAttached(var1);
   }

   @Nullable
   @Override
   public class00394 method_8321(class07209 var1) {
      return this.W.method_8321(var1);
   }

   @Override
   public class03556<class00780> method_16359(int var1, int var2, int var3) {
      return this.W.method_16359(var1, var2, var3);
   }

   @Override
   public boolean fabric_hasPersistentAttachments() {
      return this.W.fabric_hasPersistentAttachments();
   }

   @Override
   public class01042 fabric_getDynamicRegistryManager() {
      return this.W.fabric_getDynamicRegistryManager();
   }

   @Override
   public void fabric_writeAttachmentsToNbt(class08329 var1) {
      this.W.fabric_writeAttachmentsToNbt(var1);
   }

   @Override
   public void fabric_readAttachmentsFromNbt(class08299 var1) {
      this.W.fabric_readAttachmentsFromNbt(var1);
   }

   @Override
   public void fabric_computeInitialSyncChanges(class04770 var1, Consumer var2) {
      this.W.fabric_computeInitialSyncChanges(var1, var2);
   }
}
