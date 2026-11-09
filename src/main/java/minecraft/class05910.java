package minecraft;

import Nursultan.class10626;
import baritone.api.BaritoneAPI;
import baritone.api.event.events.TabCompleteEvent;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.context.ParsedArgument;
import com.mojang.brigadier.context.StringRange;
import com.mojang.brigadier.context.SuggestionContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import com.viaversion.viafabricplus.settings.impl.DebugSettings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class05910 {
   private static final Pattern Z = Pattern.compile("(\\s+)");
   private static final class00405 z = class00405.N.N(class06541.field_1061);
   private static final class00405 U = class00405.N.N(class06541.field_1080);
   private static final List<class00405> E = Stream.of(
         class06541.field_1075, class06541.field_1054, class06541.field_1060, class06541.field_1076, class06541.field_1065
      )
      .map(class00405.N::N)
      .collect(ImmutableList.toImmutableList());
   final class06202 N;
   private final class05096 W;
   final class04927 y;
   final class01590 L;
   private final boolean m;
   private final boolean P;
   final int u;
   final int i;
   final boolean R;
   final int M;
   private final List<class01028> s = Lists.newArrayList();
   private int T;
   private int b;
   @Nullable
   private ParseResults<class03461> j;
   @Nullable
   private CompletableFuture<Suggestions> v;
   private class05888 n;
   private boolean t;
   boolean B;
   private boolean G = true;

   public void L(boolean var1) {
      if (this.v != null && this.v.isDone()) {
         Suggestions suggestions = this.v.join();
         if (!suggestions.isEmpty()) {
            int ix = 0;

            for (Suggestion suggestion : suggestions.getList()) {
               ix = Math.max(ix, this.L.y(suggestion.getText()));
            }

            int jx = class04995.N(this.y.method_1889(suggestions.getRange().getStart()), 0, this.y.method_1889(0) + this.y.method_1859() - ix);
            int k = this.R ? this.W.field_22790 - 12 : 72;
            this.n = new class05888((int)this, jx, k, ix, (boolean)this.N(suggestions), var1);
         }
      }
   }

   public void L() {
      this.n = null;
   }

   public class05910(
      class06202 var1, class05096 var2, class04927 var3, class01590 var4, boolean var5, boolean var6, int var7, int var8, boolean var9, int var10
   ) {
      super();
      this.N = var1;
      this.W = var2;
      this.y = var3;
      this.L = var4;
      this.m = var5;
      this.P = var6;
      this.u = var7;
      this.i = var8;
      this.R = var9;
      this.M = var10;
      var3.method_73210(this::N);
   }

   private boolean Z() {
      return DebugSettings.INSTANCE.legacyTabCompletions.isEnabled() && this.y.method_1882().startsWith("/");
   }

   public class00392 i() {
      return (class00392)(this.n != null ? class05220.n.L().y(this.n.y()) : class05220.N);
   }

   public void u() {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(callbackinfo);
      if (!callbackinfo.isCancelled()) {
         String sx = this.y.method_1882();
         if (this.j != null && !this.j.getReader().getString().equals(sx)) {
            this.j = null;
         }

         if (!this.B) {
            this.y.method_1887(null);
            this.n = null;
         }

         this.s.clear();
         StringReader stringreader = new StringReader(sx);
         CallbackInfo callbackinfo1 = new CallbackInfo("", true);
         this.N(callbackinfo1, stringreader);
         if (!callbackinfo1.isCancelled()) {
            boolean flag = stringreader.canRead() && stringreader.peek() == '/';
            if (flag) {
               stringreader.skip();
            }

            boolean flag1 = this.m || flag;
            int ix = this.y.method_1881();
            if (flag1) {
               CommandDispatcher<class03461> commanddispatcher = ((class01683)((class04453)this.N.T_4).y_0).m();
               if (this.j == null) {
                  this.j = commanddispatcher.parse(stringreader, ((class01683)((class04453)this.N.T_4).y_0).L());
               }

               int jx = this.P ? stringreader.getCursor() : 1;
               if (ix >= jx && (this.n == null || !this.B)) {
                  this.v = commanddispatcher.getCompletionSuggestions(this.j, ix);
                  this.v.thenRun(() -> {
                     if (this.v.isDone()) {
                        this.R();
                     }
                  });
               }
            } else {
               String s1 = sx.substring(0, ix);
               int k = N(s1);
               Collection<String> collection = ((class01683)((class04453)this.N.T_4).y_0).L().af_();
               this.v = class07689.y(collection, new SuggestionsBuilder(s1, k));
            }
         }
      }
   }

   public void y(boolean var1) {
      this.G = var1;
   }

   public boolean y(class01054 var1, int var2, int var3) {
      if (this.n != null) {
         this.n.N(var1, var2, var3);
         return true;
      } else {
         return false;
      }
   }

   public class00392 y() {
      if (this.n != null && this.n.N) {
         return this.G ? class00392.L("narration.suggestion.usage.cycle.hidable") : class00392.L("narration.suggestion.usage.cycle.fixed");
      } else {
         return this.G ? class00392.L("narration.suggestion.usage.fill.hidable") : class00392.L("narration.suggestion.usage.fill.fixed");
      }
   }

   private void N(CallbackInfo var1) {
      String sx = this.y.method_1882().substring(0, Math.min(this.y.method_1882().length(), this.y.method_1881()));
      TabCompleteEvent tabcompleteevent = new TabCompleteEvent(sx);
      BaritoneAPI.getProvider().getPrimaryBaritone().getGameEventHandler().onPreTabComplete(tabcompleteevent);
      if (tabcompleteevent.isCancelled()) {
         var1.cancel();
      } else {
         if (tabcompleteevent.completions != null) {
            var1.cancel();
            this.j = null;
            if (this.B) {
               return;
            }

            this.y.method_1887(null);
            this.n = null;
            this.s.clear();
            if (tabcompleteevent.completions.length == 0) {
               this.v = Suggestions.empty();
            } else {
               StringRange stringrange = StringRange.between(sx.lastIndexOf(" ") + 1, sx.length());
               List list = Stream.of(tabcompleteevent.completions).map(var1x -> new Suggestion(stringrange, var1x)).collect(Collectors.toList());
               Suggestions suggestions = new Suggestions(stringrange, list);
               this.v = new CompletableFuture<>();
               this.v.complete(suggestions);
            }

            this.L(true);
         }
      }
   }

   public void N(class01054 var1) {
      int ix = 0;

      for (class01028 class01028 : this.s) {
         int jx = this.R ? this.W.field_22790 - 14 - 13 - 12 * ix : 72 + 12 * ix;
         var1.N(this.T - 1, jx, this.T + this.b + 1, jx + 12, this.M);
         var1.y(this.L, class01028, this.T, jx + 2, -1);
         ix++;
      }
   }

   public boolean N(class06601 var1) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return callbackinforeturnable.getReturnValueZ();
      } else {
         boolean flag = this.n != null;
         if (flag && this.n.N(var1)) {
            return true;
         } else if (this.W.method_25399() != this.y || !var1.z() || this.G && !flag) {
            return false;
         } else {
            this.L(true);
            return true;
         }
      }
   }

   @Nullable
   private class01028 N(String var1, int var2) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (class01028)callbackinforeturnable.getReturnValue();
      } else {
         return this.j != null ? N(this.j, var1, var2) : null;
      }
   }

   private void N(class01054 var1, int var2, int var3, CallbackInfo var4) {
      if (this.Z()) {
         this.s.clear();
      }
   }

   private void N(class06601 var1, CallbackInfoReturnable var2) {
      if (this.Z()) {
         if (var1.v() == 258 && this.n == null) {
            this.u();
         } else if (this.n != null) {
            if (this.n.N(var1)) {
               var2.setReturnValue(true);
               return;
            }

            this.y.method_1887(null);
            this.n = null;
         }
      }
   }

   private void N(String var1, int var2, CallbackInfoReturnable var3) {
      if (this.Z()) {
         var3.setReturnValue(class01028.a_(var1, class00405.N));
      }
   }

   public void N(boolean var1) {
      this.t = var1;
      if (!var1) {
         this.n = null;
      }
   }

   private void N(CallbackInfo var1, StringReader var2) {
      if (var2.canRead() && var2.peek() == (Character)class10626.N_1) {
         var2.skip();
         var1.cancel();
         if (this.j == null) {
            this.j = ((CommandDispatcher)class10626.N_0).parse(var2, class06202.Nq().NE().L());
         }

         int ix = this.y.method_1881();
         if (ix >= 1 && (this.n == null || !this.B)) {
            this.v = ((CommandDispatcher)class10626.N_0).getCompletionSuggestions(this.j, ix);
            this.v.thenRun(() -> {
               if (this.v.isDone()) {
                  this.R();
               }
            });
         }
      }
   }

   private boolean N(class06541 var1) {
      SuggestionContext<class03461> suggestioncontext = this.j.getContext().findSuggestionContext(this.y.method_1881());
      Map<CommandNode<class03461>, String> map = ((class01683)((class04453)this.N.T_4).y_0)
         .m()
         .getSmartUsage(suggestioncontext.parent, ((class01683)((class04453)this.N.T_4).y_0).L());
      ArrayList arraylist = Lists.newArrayList();
      int ix = 0;
      class00405 class00405 = class00405.N.N(var1);

      for (Entry entry : map.entrySet()) {
         if (!(entry.getKey() instanceof LiteralCommandNode)) {
            arraylist.add(class01028.a_((String)entry.getValue(), class00405));
            ix = Math.max(ix, this.L.y((String)entry.getValue()));
         }
      }

      if (!arraylist.isEmpty()) {
         this.s.addAll(arraylist);
         this.T = class04995.N(this.y.method_1889(suggestioncontext.startPos), 0, this.y.method_1889(0) + this.y.method_1859() - ix);
         this.b = ix;
         return true;
      } else {
         return false;
      }
   }

   private static class01028 N(CommandSyntaxException var0) {
      class00392 class00392 = class00390.N(var0.getRawMessage());
      String sx = var0.getContext();
      return sx == null ? class00392.method_30937() : class00392.N("command.context.parse_error", class00392, var0.getCursor(), sx).method_30937();
   }

   private static int N(String var0) {
      if (Strings.isNullOrEmpty(var0)) {
         return 0;
      } else {
         int ix = 0;
         Matcher matcher = Z.matcher(var0);

         while (matcher.find()) {
            ix = matcher.end();
         }

         return ix;
      }
   }

   private List<Suggestion> N(Suggestions var1) {
      String sx = this.y.method_1882().substring(0, this.y.method_1881());
      int ix = N(sx);
      String s1 = sx.substring(ix).toLowerCase(Locale.ROOT);
      ArrayList arraylist = Lists.newArrayList();
      ArrayList arraylist1 = Lists.newArrayList();

      for (Suggestion suggestion : var1.getList()) {
         if (!suggestion.getText().startsWith(s1) && !suggestion.getText().startsWith("minecraft:" + s1)) {
            arraylist1.add(suggestion);
         } else {
            arraylist.add(suggestion);
         }
      }

      arraylist.addAll(arraylist1);
      return arraylist;
   }

   public boolean N(class06613 var1) {
      return this.n != null && this.n.N((int)var1.n(), (int)var1.t());
   }

   public boolean N() {
      return this.n != null;
   }

   public void N(class01054 var1, int var2, int var3) {
      this.N(var1, var2, var3, null);
      if (!this.y(var1, var2, var3)) {
         this.N(var1);
      }
   }

   private static class01028 N(ParseResults<class03461> var0, String var1, int var2) {
      ArrayList arraylist = Lists.newArrayList();
      int ix = 0;
      int jx = -1;

      for (ParsedArgument parsedargument : var0.getContext().getLastChild().getArguments().values()) {
         if (++jx >= E.size()) {
            jx = 0;
         }

         int k = Math.max(parsedargument.getRange().getStart() - var2, 0);
         if (k >= var1.length()) {
            break;
         }

         int l = Math.min(parsedargument.getRange().getEnd() - var2, var1.length());
         if (l > 0) {
            arraylist.add(class01028.a_(var1.substring(ix, k), U));
            arraylist.add(class01028.a_(var1.substring(k, l), E.get(jx)));
            ix = l;
         }
      }

      if (var0.getReader().canRead()) {
         int i1 = Math.max(var0.getReader().getCursor() - var2, 0);
         if (i1 < var1.length()) {
            int j1 = Math.min(i1 + var0.getReader().getRemainingLength(), var1.length());
            arraylist.add(class01028.a_(var1.substring(ix, i1), U));
            arraylist.add(class01028.a_(var1.substring(i1, j1), z));
            ix = j1;
         }
      }

      arraylist.add(class01028.a_(var1.substring(ix), U));
      return class01028.a_(arraylist);
   }

   @Nullable
   static String N(String var0, String var1) {
      return var1.startsWith(var0) ? var1.substring(var0.length()) : null;
   }

   public boolean N(double var1) {
      return this.n != null && this.n.N(class04995.N(var1, -1.0, 1.0));
   }

   private void R() {
      boolean flag = false;
      if (this.y.method_1881() == this.y.method_1882().length()) {
         if (this.v.join().isEmpty() && !this.j.getExceptions().isEmpty()) {
            int ix = 0;
            Iterator<Entry<CommandNode<class03461>, CommandSyntaxException>> iterator = this.j.getExceptions().entrySet().iterator();

            while (iterator.hasNext()) {
               CommandSyntaxException commandsyntaxexception = iterator.next().getValue();
               if (commandsyntaxexception.getType() == CommandSyntaxException.BUILT_IN_EXCEPTIONS.literalIncorrect()) {
                  ix++;
               } else {
                  this.s.add(N(commandsyntaxexception));
               }
            }

            if (ix > 0) {
               this.s.add(N(CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownArgument().createWithContext(this.j.getReader())));
            }
         } else if (this.j.getReader().canRead()) {
            flag = true;
         }
      }

      this.T = 0;
      this.b = this.W.field_22789;
      if (this.s.isEmpty() && !this.N(class06541.field_1080) && flag) {
         this.s.add(N(class07686.y(this.j)));
      }

      this.n = null;
      if (this.t && ((class05630)this.N.i_7).x().method_41753()) {
         this.L(false);
      }
   }
}
