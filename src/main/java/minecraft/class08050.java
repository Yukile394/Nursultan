package minecraft;

import Nursultan.class10870;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.shorts.ShortArrayList;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import net.fabricmc.fabric.api.attachment.v1.AttachmentType;
import net.fabricmc.fabric.api.attachment.v1.AttachmentTarget.OnAttachedSet;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.fabricmc.fabric.impl.attachment.AttachmentEntrypoint;
import net.fabricmc.fabric.impl.attachment.AttachmentSerializingImpl;
import net.fabricmc.fabric.impl.attachment.AttachmentTargetImpl;
import net.fabricmc.fabric.impl.attachment.AttachmentTypeImpl;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentChange;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentTargetInfo;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentTargetInfo.ChunkTarget;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public abstract class class08050 implements class00529, class03482, class05527, AttachmentTargetImpl {
   public static final int N = -1;
   private static final Logger W = LogUtils.getLogger();
   private static final LongSet m = new LongOpenHashSet();
   protected final ShortList[] y;
   private volatile boolean P;
   private volatile boolean s;
   protected final class07321 L;
   private long T;
   @Deprecated
   @Nullable
   private class01029 b;
   @Nullable
   protected class01837 u;
   protected final class07371 i;
   @Nullable
   protected class03032 R;
   protected final Map<class07830, class07841> M;
   protected class03480 B;
   private final Map<class04748, class04932> j;
   private final Map<class04748, LongSet> v;
   protected final Map<class07209, class07001> Z;
   protected final Map<class07209, class00394> z;
   protected final class05474 U;
   protected final class00554[] E;
   @Nullable
   private IdentityHashMap n = null;
   @Nullable
   private IdentityHashMap t = null;
   @Nullable
   private IdentityHashMap G = null;

   public class05474 w() {
      return this;
   }

   public Set<class07209> L() {
      HashSet hashset = Sets.newHashSet(this.Z.keySet());
      hashset.addAll(this.z.keySet());
      return hashset;
   }

   public void L(long var1) {
      this.T = var1;
   }

   public Map<class04748, class04932> M() {
      return Collections.unmodifiableMap(this.j);
   }

   public abstract class04327<class00891> P();

   public boolean T() {
      return true;
   }

   public class04489 Q() {
      return N(this.R());
   }

   @Override
   public int method_31607() {
      return this.U.method_31607();
   }

   public class08050(class07321 var1, class07371 var2, class05474 var3, class06614 var4, long var5, @Nullable class00554[] var7, @Nullable class03032 var8) {
      super();
      this.M = Maps.newEnumMap(class07830.class);
      this.j = Maps.newHashMap();
      this.v = Maps.newHashMap();
      this.Z = Maps.newHashMap();
      this.z = new Object2ObjectOpenHashMap();
      this.L = var1;
      this.i = var2;
      this.U = var3;
      this.E = new class00554[var3.method_32890()];
      this.T = var5;
      this.y = new ShortList[var3.method_32890()];
      this.R = var8;
      this.B = new class03480(var3);
      if (var7 != null) {
         if (this.E.length == var7.length) {
            System.arraycopy(var7, 0, this.E, 0, this.E.length);
         } else {
            W.warn("Could not set level chunk sections, array length is {} instead of {}", var7.length, this.E.length);
         }
      }

      N(var4, this.E);
   }

   @Override
   public Map<class04748, LongSet> B() {
      return Collections.unmodifiableMap(this.v);
   }

   public void Z() {
      this.P = true;
   }

   @Nullable
   public class07001 i(class07209 var1) {
      return this.Z.get(var1);
   }

   public Collection<Entry<class07830, class07841>> i() {
      return Collections.unmodifiableSet(this.M.entrySet());
   }

   public class07371 b() {
      return this.i;
   }

   public abstract class04327<class04651> s();

   public long n() {
      return this.T;
   }

   @Nullable
   public class02999 l() {
      return null;
   }

   public boolean d() {
      return this.l() != null;
   }

   public ShortList[] m() {
      return this.y;
   }

   public void k() {
      this.B.N(this);
   }

   public boolean t() {
      return this.s;
   }

   @Nullable
   public class03032 v() {
      return this.R;
   }

   public boolean j() {
      return this.R != null;
   }

   public boolean U() {
      return this.P;
   }

   public boolean z() {
      if (this.P) {
         this.P = false;
         return true;
      } else {
         return false;
      }
   }

   public class00554[] u() {
      return this.E;
   }

   public void u(class07209 var1) {
      W.warn("Trying to mark a block for PostProcessing @ {}, but this operation is not supported.", var1);
   }

   @Deprecated(
      forRemoval = true
   )
   public int y() {
      int ix = this.N();
      return ix == -1 ? this.method_31607() : class01296.L(this.method_31604(ix));
   }

   public class00554 y(int var1) {
      return this.u()[var1];
   }

   @Override
   public LongSet y(class04748 var1) {
      return this.v.getOrDefault(var1, m);
   }

   public void y(long var1) {
      this.T += var1;
   }

   public boolean y(class07830 var1) {
      return this.M.get(var1) != null;
   }

   @Override
   public void y(Map<class04748, LongSet> var1) {
      this.v.clear();
      this.v.putAll(var1);
      this.Z();
   }

   public abstract class00549 E();

   public abstract void N(class00394 var1);

   public abstract void N(class07049 var1);

   public static class04489 N(class07321 var0) {
      return new class10870(var0);
   }

   public class01837 N_20(Function<class08050, class01837> var1) {
      if (this.u == null) {
         this.u = (class01837)var1.apply(this);
      }

      return this.u;
   }

   @Deprecated
   public class01029 N(Supplier<class01029> var1) {
      if (this.b == null) {
         this.b = (class01029)var1.get();
      }

      return this.b;
   }

   public void N(class04330 var1, class03222 var2) {
      class07321 class07321 = this.R();
      int ix = class01146.N(class07321.i());
      int jx = class01146.N(class07321.R());
      class05474 class05474 = this.w();

      for (int k = class05474.method_32891(); k <= class05474.method_31597(); k++) {
         class00554 class00554 = this.y(this.method_31603(k));
         int l = class01146.u(k);
         class00554.N(var1, var2, ix, l, jx);
      }
   }

   public int N() {
      class00554[] aclass00554 = this.u();

      for (int ix = aclass00554.length - 1; ix >= 0; ix--) {
         if (!aclass00554[ix].L()) {
            return ix;
         }
      }

      return -1;
   }

   private void N(AttachmentType var1, Object var2, class01929 var3) {
      class01042 class01042 = var3 instanceof class01042 ? (class01042)var3 : this.fabric_getDynamicRegistryManager();
      this.N(var1, AttachmentChange.create(this.fabric_getSyncTargetInfo(), var1, var2, class01042));
   }

   private void N(AttachmentType var1, @Nullable AttachmentChange var2) {
      if (var2 == null) {
         if (this.t == null) {
            return;
         }

         this.t.remove(var1);
      } else {
         if (this.t == null) {
            this.t = new IdentityHashMap();
         }

         this.t.put(var1, var2);
      }
   }

   @Nullable
   public abstract class00500 N(class07209 var1, class00500 var2, int var3);

   @Nullable
   public class00500 N(class07209 var1, class00500 var2) {
      return this.N(var1, var2, 3);
   }

   public class01166 N(int var1) {
      return class01166.N;
   }

   private static void N(class06614 var0, class00554[] var1) {
      for (int ix = 0; ix < var1.length; ix++) {
         if (var1[ix] == null) {
            var1[ix] = new class00554(var0);
         }
      }
   }

   @Override
   public final void N(BiConsumer<class07209, class00500> var1) {
      this.N(var0 -> var0.m() != 0, var1);
   }

   @Override
   public void N(class04748 var1, long var2) {
      this.v.computeIfAbsent(var1, var0 -> new LongOpenHashSet()).add(var2);
      this.Z();
   }

   public void N_86(Map<class04748, class04932> var1) {
      this.j.clear();
      this.j.putAll(var1);
      this.Z();
   }

   @Override
   public void N(class04748 var1, class04932 var2) {
      this.j.put(var1, var2);
      this.Z();
   }

   @Nullable
   @Override
   public class04932 N(class04748 var1) {
      return this.j.get(var1);
   }

   public abstract class08094 N(long var1);

   public abstract void N(class07209 var1);

   public void N(ShortList var1, int var2) {
      N(this.m(), var2).addAll(var1);
   }

   public void N(class07001 var1) {
      class07209 class07209 = class00394.N(this.L, var1);
      if (!this.z.containsKey(class07209)) {
         this.Z.put(class07209, var1);
      }
   }

   public boolean N(int var1, int var2) {
      if (var1 < this.method_31607()) {
         var1 = this.method_31607();
      }

      if (var2 > this.method_31600()) {
         var2 = this.method_31600();
      }

      for (int ix = var1; ix <= var2; ix += 16) {
         if (!this.y(this.method_31602(ix)).L()) {
            return false;
         }
      }

      return true;
   }

   @Nullable
   public abstract class07001 N(class07209 var1, class01929 var2);

   public class07841 N(class07830 var1) {
      return this.M.computeIfAbsent(var1, var1x -> new class07841(this, var1x));
   }

   public void N(class07830 var1, long[] var2) {
      this.N(var1).N(this, var1, var2);
   }

   public static ShortList N(ShortList[] var0, int var1) {
      Object object = var0[var1];
      if (object == null) {
         object = new ShortArrayList();
         var0[var1] = (ShortList)object;
      }

      return (ShortList)object;
   }

   public void N(boolean var1) {
      this.s = var1;
      this.Z();
   }

   public int N(class07830 var1, int var2, int var3) {
      class07841 class07841 = this.M.get(var1);
      if (class07841 == null) {
         if (class07529.ND && this instanceof class00570) {
            W.error("Unprimed heightmap: {} {} {}", new Object[]{var1, var2, var3});
         }

         class07841.N(this, EnumSet.of(var1));
         class07841 = this.M.get(var1);
      }

      return class07841.N(var2 & 15, var3 & 15) - 1;
   }

   public void N(Predicate<class00500> var1, BiConsumer<class07209, class00500> var2) {
      class07218 class07218 = new class07218();

      for (int ix = this.method_32891(); ix <= this.method_31597(); ix++) {
         class00554 class00554 = this.y(this.method_31603(ix));
         if (class00554.N(var1)) {
            class07209 class07209 = class01296.N(this.L, ix).z();

            for (int jx = 0; jx < 16; jx++) {
               for (int k = 0; k < 16; k++) {
                  for (int l = 0; l < 16; l++) {
                     class00500 class00500 = class00554.N(l, jx, k);
                     if (var1.test(class00500)) {
                        var2.accept(class07218.N(class07209, l, jx, k), class00500);
                     }
                  }
               }
            }
         }
      }
   }

   public class00549 W() {
      class00549 class00549 = this.E();
      class02999 class02999 = this.l();
      return class02999 != null ? class00549.N(class02999.N(), class00549) : class00549;
   }

   public class07321 R() {
      return this.L;
   }

   public boolean G() {
      return !this.B().isEmpty();
   }

   @Override
   public class03480 Y() {
      return this.B;
   }

   public AttachmentTargetInfo fabric_getSyncTargetInfo() {
      return new ChunkTarget(this.L);
   }

   public Map fabric_getAttachments() {
      return this.n;
   }

   public boolean fabric_shouldTryToSync() {
      return false;
   }

   public void fabric_markChanged(AttachmentType var1) {
      this.Z();
      if (var1.isPersistent() && this.E().equals(class00549.L)) {
         AttachmentEntrypoint.LOGGER
            .warn("Attaching persistent attachment {} to chunk {} with chunk status EMPTY. Attachment might be discarded.", var1.identifier(), this.R());
      }
   }

   public boolean hasAttached(AttachmentType var1) {
      return this.n != null && this.n.containsKey(var1);
   }

   public Event onAttachedSet(AttachmentType var1) {
      if (this.G == null) {
         this.G = new IdentityHashMap();
      }

      return this.G.computeIfAbsent(var1, var0 -> EventFactory.createArrayBacked(OnAttachedSet.class, var0x -> (var1x, var2) -> {
         OnAttachedSet[] aonattachedset = var0x;
         int ix = var0x.length;

         for (int jx = 0; jx < ix; jx++) {
            aonattachedset[jx].onAttachedSet(var1x, var2);
         }
      }));
   }

   @Nullable
   public Object setAttached(AttachmentType var1, @Nullable Object var2) {
      Object object;
      if (var2 == null) {
         object = this.n == null ? null : this.n.remove(var1);
      } else {
         if (this.n == null) {
            this.n = new IdentityHashMap();
         }

         object = this.n.put(var1, var2);
      }

      if (this.G != null) {
         Event event = (Event)this.G.get(var1);
         if (event != null) {
            ((OnAttachedSet)event.invoker()).onAttachedSet(object, var2);
         }
      }

      if (!Objects.equals(object, var2)) {
         this.fabric_markChanged(var1);
         if (this.fabric_shouldTryToSync() && var1.isSynced()) {
            AttachmentChange attachmentchange = AttachmentChange.create(this.fabric_getSyncTargetInfo(), var1, var2, this.fabric_getDynamicRegistryManager());
            this.N(var1, attachmentchange);
            this.fabric_syncChange(var1, attachmentchange);
         }
      }

      return object;
   }

   @Nullable
   public Object getAttached(AttachmentType var1) {
      return this.n == null ? null : this.n.get(var1);
   }

   @Override
   public int method_31605() {
      return this.U.method_31605();
   }

   @Override
   public class03556<class00780> method_16359(int var1, int var2, int var3) {
      try {
         int ix = class01146.N(this.method_31607());
         int k = ix + class01146.N(this.method_31605()) - 1;
         int l = class04995.N(var2, ix, k);
         int jx = this.method_31602(class01146.L(l));
         return this.E[jx].L(var1 & 3, l & 3, var3 & 3);
      } catch (Throwable throwable) {
         class07080 class07080 = class07080.N(throwable, "Getting biome");
         class07074 class07074 = class07080.N("Biome being got");
         class07074.N("Location", () -> class07074.N(this, var1, var2, var3));
         throw new class07878(class07080);
      }
   }

   public boolean fabric_hasPersistentAttachments() {
      return AttachmentSerializingImpl.hasPersistentAttachments(this.n);
   }

   public class01042 fabric_getDynamicRegistryManager() {
      throw new UnsupportedOperationException("Chunk does not have a DynamicRegistryManager.");
   }

   public void fabric_writeAttachmentsToNbt(class08329 var1) {
      AttachmentSerializingImpl.serializeAttachmentData(var1, this.n);
   }

   public void fabric_readAttachmentsFromNbt(class08299 var1) {
      IdentityHashMap<AttachmentType<?>, Object> identityhashmap = AttachmentSerializingImpl.deserializeAttachmentData(var1);
      if (identityhashmap != null) {
         this.n = identityhashmap;
         if (this.fabric_shouldTryToSync() && this.n != null) {
            this.n.forEach((var2x, var3) -> {
               if (var2x.isSynced()) {
                  this.N(var2x, var3, var1.N());
               }
            });
         }
      }
   }

   public void fabric_computeInitialSyncChanges(class04770 var1, Consumer var2) {
      if (this.t != null) {
         for (Entry entry : this.t.entrySet()) {
            if (((AttachmentTypeImpl)entry.getKey()).syncPredicate().test(this, var1)) {
               var2.accept((AttachmentChange)entry.getValue());
            }
         }
      }
   }
}
