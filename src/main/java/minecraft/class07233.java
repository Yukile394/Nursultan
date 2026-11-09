package minecraft;

import Nursultan.class09369;
import com.mojang.brigadier.tree.ArgumentCommandNode;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import com.mojang.brigadier.tree.RootCommandNode;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import it.unimi.dsi.fastutil.ints.IntSets;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.ArrayDeque;
import java.util.List;
import java.util.function.BiPredicate;
import org.jspecify.annotations.Nullable;

public class class07233 implements class00381<class07280> {
   public static final class02362<class00667, class07233> N = class00381.N(class07233::N, class07233::new);
   private static final byte y = 3;
   private static final byte L = 4;
   private static final byte u = 8;
   private static final byte i = 16;
   private static final byte R = 32;
   private static final byte M = 0;
   private static final byte B = 1;
   private static final byte Z = 2;
   private final int z;
   private final List<class00487> U;

   public <S> class07233(RootCommandNode<S> var1, class07273<S> var2) {
      super();
      Object2IntMap object2intmap = N(var1);
      this.U = N(object2intmap, var2);
      this.z = object2intmap.getInt(var1);
   }

   private class07233(class00667 var1) {
      super();
      this.U = var1.N_16(class07233::y);
      this.z = var1.E();
      N(this.U);
   }

   private static class00487 y(class00667 var0) {
      byte b0 = var0.readByte();
      int[] aint = var0.L();
      int ix = (b0 & 8) != 0 ? var0.E() : 0;
      class00508 class00508 = N(var0, b0);
      return new class00487(class00508, b0, ix, aint);
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   private static <S> class00487 N(CommandNode<S> var0, class07273<S> var1, Object2IntMap<CommandNode<S>> var2) {
      int ix = 0;
      int j;
      if (var0.getRedirect() != null) {
         ix |= 8;
         j = var2.getInt(var0.getRedirect());
      } else {
         j = 0;
      }

      if (var1.N((CommandNode<S>)var0)) {
         ix |= 4;
      }

      if (var1.y((CommandNode<S>)var0)) {
         ix |= 32;
      }

      Object object;
      switch (var0) {
         case RootCommandNode rootcommandnode:
            ix |= 0;
            object = null;
            break;
         case ArgumentCommandNode argumentcommandnode:
            class01894 class01894 = var1.N(argumentcommandnode);
            object = new class00523(argumentcommandnode.getName(), class06789.y(argumentcommandnode.getType()), class01894);
            ix |= 2;
            if (class01894 != null) {
               ix |= 16;
            }
            break;
         case LiteralCommandNode literalcommandnode:
            object = new class00485(literalcommandnode.getLiteral());
            ix |= 1;
            break;
         default:
            throw new UnsupportedOperationException("Unknown node type " + var0);
      }

      int[] aint = var0.getChildren().stream().mapToInt(var2::getInt).toArray();
      return new class00487((class00508)object, ix, j, aint);
   }

   @Nullable
   private static class00508 N(class00667 var0, byte var1) {
      int ix = var1 & 3;
      if (ix == 2) {
         String s1 = var0.s();
         int j = var0.E();
         class06799<?, ?> class06799 = class04206.t.N(j);
         if (class06799 == null) {
            return null;
         } else {
            class06763 class06763 = class06799.y(var0);
            class01894 class01894 = (var1 & 16) != 0 ? var0.T() : null;
            return new class00523(s1, class06763, class01894);
         }
      } else if (ix == 1) {
         String s = var0.s();
         return new class00485(s);
      } else {
         return null;
      }
   }

   public <S> RootCommandNode<S> N(class04348 var1, class07263<S> var2) {
      return (RootCommandNode<S>)new class09369<S>(var1, var2, this.U).N(this.z);
   }

   private static void N(List<class00487> var0) {
      N(var0, class00487::N);
      N(var0, class00487::y);
   }

   private static void N(List<class00487> var0, BiPredicate<class00487, IntSet> var1) {
      IntOpenHashSet intopenhashset = new IntOpenHashSet(IntSets.fromTo(0, var0.size()));

      while (!intopenhashset.isEmpty()) {
         if (!intopenhashset.removeIf(var3 -> var1.test((class00487)var0.get(var3), intopenhashset))) {
            throw new IllegalStateException("Server sent an impossible command tree");
         }
      }
   }

   private static <S> Object2IntMap<CommandNode<S>> N(RootCommandNode<S> var0) {
      Object2IntOpenHashMap object2intopenhashmap = new Object2IntOpenHashMap();
      ArrayDeque arraydeque = new ArrayDeque();
      arraydeque.add(var0);

      CommandNode commandnode;
      while ((commandnode = (CommandNode)arraydeque.poll()) != null) {
         if (!object2intopenhashmap.containsKey(commandnode)) {
            int ix = object2intopenhashmap.size();
            object2intopenhashmap.put(commandnode, ix);
            arraydeque.addAll(commandnode.getChildren());
            if (commandnode.getRedirect() != null) {
               arraydeque.add(commandnode.getRedirect());
            }
         }
      }

      return object2intopenhashmap;
   }

   private static <S> List<class00487> N(Object2IntMap<CommandNode<S>> var0, class07273<S> var1) {
      ObjectArrayList objectarraylist = new ObjectArrayList(var0.size());
      objectarraylist.size(var0.size());
      ObjectIterator objectiterator = Object2IntMaps.fastIterable(var0).iterator();

      while (objectiterator.hasNext()) {
         Entry entry = (Entry)objectiterator.next();
         objectarraylist.set(entry.getIntValue(), N((CommandNode<S>)entry.getKey(), var1, var0));
      }

      return objectarraylist;
   }

   private void N(class00667 var1) {
      var1.N_12(this.U, (var0, var1x) -> var1x.N(var0));
      var1.L(this.z);
   }

   @Override
   public class02897<class07233> method_65080() {
      return class04248.b;
   }
}
