package minecraft;

import java.util.List;

public class class07925 {
   private static void L(class00751<class07945<?, ?>> var0) {
      class07945.<List<class07395>>N(class07391::N).N("Get the ban list").N("banlist", class07389.l.y()).N(var0, "bans");
      class07945.N(class07391::L).N("Set the banlist").y("bans", class07389.l.y()).N("banlist", class07389.l.y()).N(var0, "bans/set");
      class07945.<List<class07395>, List<class07395>>N(class07391::N)
         .N("Add players to ban list")
         .y("add", class07389.l.y())
         .N("banlist", class07389.l.y())
         .N(var0, "bans/add");
      class07945.<List<class07947>, List<class07395>>N(class07391::y)
         .N("Remove players from ban list")
         .y("remove", class07389.E.y())
         .N("banlist", class07389.l.y())
         .N(var0, "bans/remove");
      class07945.<List<class07395>>N(class07391::N).N("Clear all players in ban list").N("banlist", class07389.l.y()).N(var0, "bans/clear");
   }

   private static void M(class00751<class07945<?, ?>> var0) {
      class07945.<class07382>N(class07416::N).N("Get server status").N("status", class07389.m.N()).N(var0, "server/status");
      class07945.<Boolean, Boolean>N(class07416::N).N("Save server state").y("flush", class07389.y).N("saving", class07389.y).N(var0, "server/save");
      class07945.<Boolean>N(class07416::N).N("Stop server").N("stopping", class07389.y).N(var0, "server/stop");
      class07945.<class07379, Boolean>N(class07416::N)
         .N("Send a system message")
         .y("message", class07389.j.N())
         .N("sent", class07389.y)
         .N(var0, "server/system_message");
   }

   public class07925() {
      super();
   }

   private static void B(class00751<class07945<?, ?>> var0) {
      class07945.<Boolean>N(class07402::N)
         .N("Get whether automatic world saving is enabled on the server")
         .N("enabled", class07389.y)
         .N(var0, "serversettings/autosave");
      class07945.<Boolean, Boolean>N(class07402::N)
         .N("Enable or disable automatic world saving on the server")
         .y("enable", class07389.y)
         .N("enabled", class07389.y)
         .N(var0, "serversettings/autosave/set");
      class07945.<class07086>N(class07402::y)
         .N("Get the current difficulty level of the server")
         .N("difficulty", class07389.Z.N())
         .N(var0, "serversettings/difficulty");
      class07945.<class07086, class07086>N(class07402::N)
         .N("Set the difficulty level of the server")
         .y("difficulty", class07389.Z.N())
         .N("difficulty", class07389.Z.N())
         .N(var0, "serversettings/difficulty/set");
      class07945.<Boolean>N(class07402::L)
         .N("Get whether allowlist enforcement is enabled (kicks players immediately when removed from allowlist)")
         .N("enforced", class07389.y)
         .N(var0, "serversettings/enforce_allowlist");
      class07945.<Boolean, Boolean>N(class07402::y)
         .N("Enable or disable allowlist enforcement (when enabled, players are kicked immediately upon removal from allowlist)")
         .y("enforce", class07389.y)
         .N("enforced", class07389.y)
         .N(var0, "serversettings/enforce_allowlist/set");
      class07945.<Boolean>N(class07402::u)
         .N("Get whether the allowlist is enabled on the server")
         .N("used", class07389.y)
         .N(var0, "serversettings/use_allowlist");
      class07945.<Boolean, Boolean>N(class07402::L)
         .N("Enable or disable the allowlist on the server (controls whether only allowlisted players can join)")
         .y("use", class07389.y)
         .N("used", class07389.y)
         .N(var0, "serversettings/use_allowlist/set");
      class07945.<Integer>N(class07402::i)
         .N("Get the maximum number of players allowed to connect to the server")
         .N("max", class07389.L)
         .N(var0, "serversettings/max_players");
      class07945.<Integer, Integer>N(class07402::N)
         .N("Set the maximum number of players allowed to connect to the server")
         .y("max", class07389.L)
         .N("max", class07389.L)
         .N(var0, "serversettings/max_players/set");
      class07945.<Integer>N(class07402::R)
         .N("Get the number of seconds before the game is automatically paused when no players are online")
         .N("seconds", class07389.L)
         .N(var0, "serversettings/pause_when_empty_seconds");
      class07945.<Integer, Integer>N(class07402::y)
         .N("Set the number of seconds before the game is automatically paused when no players are online")
         .y("seconds", class07389.L)
         .N("seconds", class07389.L)
         .N(var0, "serversettings/pause_when_empty_seconds/set");
      class07945.<Integer>N(class07402::M)
         .N("Get the number of seconds before idle players are automatically kicked from the server")
         .N("seconds", class07389.L)
         .N(var0, "serversettings/player_idle_timeout");
      class07945.<Integer, Integer>N(class07402::L)
         .N("Set the number of seconds before idle players are automatically kicked from the server")
         .y("seconds", class07389.L)
         .N("seconds", class07389.L)
         .N(var0, "serversettings/player_idle_timeout/set");
      class07945.<Boolean>N(class07402::B)
         .N("Get whether flight is allowed for players in Survival mode")
         .N("allowed", class07389.y)
         .N(var0, "serversettings/allow_flight");
      class07945.<Boolean, Boolean>N(class07402::u)
         .N("Allow or disallow flight for players in Survival mode")
         .y("allow", class07389.y)
         .N("allowed", class07389.y)
         .N(var0, "serversettings/allow_flight/set");
      class07945.N(class07402::z).N("Get the server's message of the day displayed to players").N("message", class07389.R).N(var0, "serversettings/motd");
      class07945.<String, String>N(class07402::N)
         .N("Set the server's message of the day displayed to players")
         .y("message", class07389.R)
         .N("message", class07389.R)
         .N(var0, "serversettings/motd/set");
      class07945.N(class07402::Z)
         .N("Get the spawn protection radius in blocks (only operators can edit within this area)")
         .N("radius", class07389.L)
         .N(var0, "serversettings/spawn_protection_radius");
      class07945.<Integer, Integer>N(class07402::u)
         .N("Set the spawn protection radius in blocks (only operators can edit within this area)")
         .y("radius", class07389.L)
         .N("radius", class07389.L)
         .N(var0, "serversettings/spawn_protection_radius/set");
      class07945.N(class07402::U)
         .N("Get whether players are forced to use the server's default game mode")
         .N("forced", class07389.y)
         .N(var0, "serversettings/force_game_mode");
      class07945.<Boolean, Boolean>N(class07402::i)
         .N("Enable or disable forcing players to use the server's default game mode")
         .y("force", class07389.y)
         .N("forced", class07389.y)
         .N(var0, "serversettings/force_game_mode/set");
      class07945.N(class07402::E).N("Get the server's default game mode").N("mode", class07389.z.N()).N(var0, "serversettings/game_mode");
      class07945.<class07282, class07282>N(class07402::N)
         .N("Set the server's default game mode")
         .y("mode", class07389.z.N())
         .N("mode", class07389.z.N())
         .N(var0, "serversettings/game_mode/set");
      class07945.N(class07402::W).N("Get the server's view distance in chunks").N("distance", class07389.L).N(var0, "serversettings/view_distance");
      class07945.<Integer, Integer>N(class07402::i)
         .N("Set the server's view distance in chunks")
         .y("distance", class07389.L)
         .N("distance", class07389.L)
         .N(var0, "serversettings/view_distance/set");
      class07945.N(class07402::m).N("Get the server's simulation distance in chunks").N("distance", class07389.L).N(var0, "serversettings/simulation_distance");
      class07945.<Integer, Integer>N(class07402::R)
         .N("Set the server's simulation distance in chunks")
         .y("distance", class07389.L)
         .N("distance", class07389.L)
         .N(var0, "serversettings/simulation_distance/set");
      class07945.N(class07402::P)
         .N("Get whether the server accepts player transfers from other servers")
         .N("accepted", class07389.y)
         .N(var0, "serversettings/accept_transfers");
      class07945.<Boolean, Boolean>N(class07402::R)
         .N("Enable or disable accepting player transfers from other servers")
         .y("accept", class07389.y)
         .N("accepted", class07389.y)
         .N(var0, "serversettings/accept_transfers/set");
      class07945.N(class07402::s)
         .N("Get the interval in seconds between server status heartbeats")
         .N("seconds", class07389.L)
         .N(var0, "serversettings/status_heartbeat_interval");
      class07945.<Integer, Integer>N(class07402::M)
         .N("Set the interval in seconds between server status heartbeats")
         .y("seconds", class07389.L)
         .N("seconds", class07389.L)
         .N(var0, "serversettings/status_heartbeat_interval/set");
      class07945.N(class07402::T).N("Get default operator permission level").N("level", class07389.U).N(var0, "serversettings/operator_user_permission_level");
      class07945.<class08195, class08195>N(class07402::N)
         .N("Set default operator permission level")
         .y("level", class07389.U)
         .N("level", class07389.U)
         .N(var0, "serversettings/operator_user_permission_level/set");
      class07945.N(class07402::b)
         .N("Get whether the server hides online player information from status queries")
         .N("hidden", class07389.y)
         .N(var0, "serversettings/hide_online_players");
      class07945.<Boolean, Boolean>N(class07402::M)
         .N("Enable or disable hiding online player information from status queries")
         .y("hide", class07389.y)
         .N("hidden", class07389.y)
         .N(var0, "serversettings/hide_online_players/set");
      class07945.N(class07402::j)
         .N("Get whether the server responds to connection status requests")
         .N("enabled", class07389.y)
         .N(var0, "serversettings/status_replies");
      class07945.<Boolean, Boolean>N(class07402::B)
         .N("Enable or disable the server responding to connection status requests")
         .y("enable", class07389.y)
         .N("enabled", class07389.y)
         .N(var0, "serversettings/status_replies/set");
      class07945.N(class07402::v)
         .N("Get the entity broadcast range as a percentage")
         .N("percentage_points", class07389.L)
         .N(var0, "serversettings/entity_broadcast_range");
      class07945.<Integer, Integer>N(class07402::B)
         .N("Set the entity broadcast range as a percentage")
         .y("percentage_points", class07389.L)
         .N("percentage_points", class07389.L)
         .N(var0, "serversettings/entity_broadcast_range/set");
   }

   private static void Z(class00751<class07945<?, ?>> var0) {
      class07945.<List<class07423<?>>>N(class07405::N)
         .N("Get the available game rule keys and their current values")
         .N("gamerules", class07389.s.N().u())
         .N(var0, "gamerules");
      class07945.<class07423<T>, class07423<T>>N(class07405::N)
         .N("Update game rule value")
         .y("gamerule", class07389.T.N())
         .N("gamerule", class07389.s.N())
         .N(var0, "gamerules/update");
   }

   private static void i(class00751<class07945<?, ?>> var0) {
      class07945.<List<class07947>>N(class07406::N).N("Get all connected players").N("players", class07389.E.y()).N(var0, "players");
      class07945.<List<class07384>, List<class07947>>N(class07406::N)
         .N("Kick players")
         .y("kick", class07389.v.y())
         .N("kicked", class07389.E.y())
         .N(var0, "players/kick");
   }

   private static void u(class00751<class07945<?, ?>> var0) {
      class07945.<List<class07385>>N(class07392::N).N("Get the ip ban list").N("banlist", class07389.G.y()).N(var0, "ip_bans");
      class07945.<List<class07385>, List<class07385>>N(class07392::L)
         .N("Set the ip banlist")
         .y("banlist", class07389.G.y())
         .N("banlist", class07389.G.y())
         .N(var0, "ip_bans/set");
      class07945.<List<class07390>, List<class07385>>N(class07392::N)
         .N("Add ip to ban list")
         .y("add", class07389.t.y())
         .N("banlist", class07389.G.y())
         .N(var0, "ip_bans/add");
      class07945.<List<String>, List<class07385>>N(class07392::y)
         .N("Remove ip from ban list")
         .y("ip", class07389.R.u())
         .N("banlist", class07389.G.y())
         .N(var0, "ip_bans/remove");
      class07945.<List<class07385>>N(class07392::N).N("Clear all ips in ban list").N("banlist", class07389.G.y()).N(var0, "ip_bans/clear");
   }

   private static void y(class00751<class07945<?, ?>> var0) {
      class07945.<List<class07947>>N(class07413::N).N("Get the allowlist").N("allowlist", class07389.E.y()).N(var0, "allowlist");
      class07945.<List<class07947>, List<class07947>>N(class07413::L)
         .N("Set the allowlist")
         .y("players", class07389.E.y())
         .N("allowlist", class07389.E.y())
         .N(var0, "allowlist/set");
      class07945.<List<class07947>, List<class07947>>N(class07413::N)
         .N("Add players to allowlist")
         .y("add", class07389.E.y())
         .N("allowlist", class07389.E.y())
         .N(var0, "allowlist/add");
      class07945.<List<class07947>, List<class07947>>N(class07413::y)
         .N("Remove players from allowlist")
         .y("remove", class07389.E.y())
         .N("allowlist", class07389.E.y())
         .N(var0, "allowlist/remove");
      class07945.<List<class07947>>N(class07413::N).N("Clear all players in allowlist").N("allowlist", class07389.E.y()).N(var0, "allowlist/clear");
   }

   public static class07945<?, ?> N(class00751<class07945<?, ?>> var0) {
      y(var0);
      L(var0);
      u(var0);
      i(var0);
      R(var0);
      M(var0);
      B(var0);
      Z(var0);
      return class07945.<class07420>N(var0x -> class07410.N(class07389.L())).N().y().N("result", class07389.B).N(var0, "rpc.discover");
   }

   private static void R(class00751<class07945<?, ?>> var0) {
      class07945.<List<class07397>>N(class07417::N).N("Get all oped players").N("operators", class07389.n.y()).N(var0, "operators");
      class07945.<List<class07397>, List<class07397>>N(class07417::L)
         .N("Set all oped players")
         .y("operators", class07389.n.y())
         .N("operators", class07389.n.y())
         .N(var0, "operators/set");
      class07945.<List<class07397>, List<class07397>>N(class07417::y)
         .N("Op players")
         .y("add", class07389.n.y())
         .N("operators", class07389.n.y())
         .N(var0, "operators/add");
      class07945.<List<class07947>, List<class07397>>N(class07417::N)
         .N("Deop players")
         .y("remove", class07389.E.y())
         .N("operators", class07389.n.y())
         .N(var0, "operators/remove");
      class07945.<List<class07397>>N(class07417::N).N("Deop all players").N("operators", class07389.n.y()).N(var0, "operators/clear");
   }
}
