# BukkitAPI
Bukkit JavaDoc 中文翻译

JavaDoc译自<https://hub.spigotmc.org/stash/projects/SPIGOT/repos/bukkit/browse/src/main/java/org/bukkit>

## 目录&翻译状态

    bukkit
    ├── Achievement.java
    ├── Art.java
    ├── BanEntry.java
    ├── BanList.java
    ├── block
    │   ├── banner
    │   │   ├── Pattern.java
    │   │   └── PatternType.java
    │   ├── Banner.java
    │   ├── Beacon.java
    │   ├── Biome.java
    │   ├── BlockFace.java
    │   ├── Block.java
    │   ├── BlockState.java
    │   ├── BrewingStand.java
    │   ├── Chest.java
    │   ├── CommandBlock.java
    │   ├── ContainerBlock.java
    │   ├── CreatureSpawner.java
    │   ├── Dispenser.java
    │   ├── DoubleChest.java
    │   ├── Dropper.java
    │   ├── Furnace.java
    │   ├── Hopper.java
    │   ├── Jukebox.java
    │   ├── NoteBlock.java
    │   ├── PistonMoveReaction.java
    │   ├── Sign.java
    │   └── Skull.java
    ├── BlockChangeDelegate.java
    ├── Bukkit.java
    ├── ChatColor.java
    ├── Chunk.java
    ├── ChunkSnapshot.java
    ├── CoalType.java
    ├── Color.java
    ├── command
    │   ├── BlockCommandSender.java
    │   ├── CommandException.java
    │   ├── CommandExecutor.java
    │   ├── Command.java
    │   ├── CommandMap.java
    │   ├── CommandSender.java
    │   ├── ConsoleCommandSender.java
    │   ├── defaults
    │   │   ├── AchievementCommand.java
    │   │   ├── BanCommand.java
    │   │   ├── BanIpCommand.java
    │   │   ├── BanListCommand.java
    │   │   ├── BukkitCommand.java
    │   │   ├── ClearCommand.java
    │   │   ├── DefaultGameModeCommand.java
    │   │   ├── DeopCommand.java
    │   │   ├── DifficultyCommand.java
    │   │   ├── EffectCommand.java
    │   │   ├── EnchantCommand.java
    │   │   ├── ExpCommand.java
    │   │   ├── GameModeCommand.java
    │   │   ├── GameRuleCommand.java
    │   │   ├── GiveCommand.java
    │   │   ├── HelpCommand.java
    │   │   ├── KickCommand.java
    │   │   ├── KillCommand.java
    │   │   ├── ListCommand.java
    │   │   ├── MeCommand.java
    │   │   ├── OpCommand.java
    │   │   ├── PardonCommand.java
    │   │   ├── PardonIpCommand.java
    │   │   ├── PlaySoundCommand.java
    │   │   ├── PluginsCommand.java
    │   │   ├── ReloadCommand.java
    │   │   ├── SaveCommand.java
    │   │   ├── SaveOffCommand.java
    │   │   ├── SaveOnCommand.java
    │   │   ├── SayCommand.java
    │   │   ├── ScoreboardCommand.java
    │   │   ├── SeedCommand.java
    │   │   ├── SetIdleTimeoutCommand.java
    │   │   ├── SetWorldSpawnCommand.java
    │   │   ├── SpawnpointCommand.java
    │   │   ├── SpreadPlayersCommand.java
    │   │   ├── StopCommand.java
    │   │   ├── TeleportCommand.java
    │   │   ├── TellCommand.java
    │   │   ├── TestForCommand.java
    │   │   ├── TimeCommand.java
    │   │   ├── TimingsCommand.java
    │   │   ├── ToggleDownfallCommand.java
    │   │   ├── VanillaCommand.java
    │   │   ├── VersionCommand.java
    │   │   ├── WeatherCommand.java
    │   │   └── WhitelistCommand.java
    │   ├── FormattedCommandAlias.java
    │   ├── MultipleCommandAlias.java
    │   ├── PluginCommand.java
    │   ├── PluginCommandYamlParser.java
    │   ├── PluginIdentifiableCommand.java
    │   ├── ProxiedCommandSender.java
    │   ├── RemoteConsoleCommandSender.java
    │   ├── SimpleCommandMap.java
    │   ├── TabCommandExecutor.java
    │   ├── TabCompleter.java
    │   └── TabExecutor.java
    ├── configuration
    │   ├── Configuration.java
    │   ├── ConfigurationOptions.java
    │   ├── ConfigurationSection.java
    │   ├── file
    │   │   ├── FileConfiguration.java
    │   │   ├── FileConfigurationOptions.java
    │   │   ├── YamlConfiguration.java
    │   │   ├── YamlConfigurationOptions.java
    │   │   ├── YamlConstructor.java
    │   │   └── YamlRepresenter.java
    │   ├── InvalidConfigurationException.java
    │   ├── MemoryConfiguration.java
    │   ├── MemoryConfigurationOptions.java
    │   ├── MemorySection.java
    │   └── serialization
    │       ├── ConfigurationSerializable.java
    │       ├── ConfigurationSerialization.java
    │       ├── DelegateDeserialization.java
    │       └── SerializableAs.java
    ├── conversations
    │   ├── BooleanPrompt.java
    │   ├── Conversable.java
    │   ├── ConversationAbandonedEvent.java
    │   ├── ConversationAbandonedListener.java
    │   ├── ConversationCanceller.java
    │   ├── ConversationContext.java
    │   ├── ConversationFactory.java
    │   ├── Conversation.java
    │   ├── ConversationPrefix.java
    │   ├── ExactMatchConversationCanceller.java
    │   ├── FixedSetPrompt.java
    │   ├── InactivityConversationCanceller.java
    │   ├── ManuallyAbandonedConversationCanceller.java
    │   ├── MessagePrompt.java
    │   ├── NullConversationPrefix.java
    │   ├── NumericPrompt.java
    │   ├── PlayerNamePrompt.java
    │   ├── PluginNameConversationPrefix.java
    │   ├── Prompt.java
    │   ├── RegexPrompt.java
    │   ├── StringPrompt.java
    │   └── ValidatingPrompt.java
    ├── CropState.java
    ├── Difficulty.java
    ├── DyeColor.java
    ├── Effect.java
    ├── enchantments
    │   ├── Enchantment.java
    │   ├── EnchantmentTarget.java
    │   └── EnchantmentWrapper.java
    ├── entity
    │   ├── Ageable.java
    │   ├── Ambient.java
    │   ├── Animals.java
    │   ├── AnimalTamer.java
    │   ├── ArmorStand.java
    │   ├── Arrow.java
    │   ├── Bat.java
    │   ├── Blaze.java
    │   ├── Boat.java
    │   ├── CaveSpider.java
    │   ├── Chicken.java
    │   ├── ComplexEntityPart.java
    │   ├── ComplexLivingEntity.java
    │   ├── Cow.java
    │   ├── Creature.java
    │   ├── CreatureType.java
    │   ├── Creeper.java
    │   ├── Damageable.java
    │   ├── Egg.java
    │   ├── EnderCrystal.java
    │   ├── EnderDragon.java
    │   ├── EnderDragonPart.java
    │   ├── Enderman.java
    │   ├── Endermite.java
    │   ├── EnderPearl.java
    │   ├── EnderSignal.java
    │   ├── Entity.java
    │   ├── EntityType.java
    │   ├── ExperienceOrb.java
    │   ├── Explosive.java
    │   ├── FallingBlock.java
    │   ├── FallingSand.java
    │   ├── Fireball.java
    │   ├── Firework.java
    │   ├── FishHook.java
    │   ├── Fish.java
    │   ├── Flying.java
    │   ├── Ghast.java
    │   ├── Giant.java
    │   ├── Golem.java
    │   ├── Guardian.java
    │   ├── Hanging.java
    │   ├── Horse.java
    │   ├── HumanEntity.java
    │   ├── IronGolem.java
    │   ├── ItemFrame.java
    │   ├── Item.java
    │   ├── LargeFireball.java
    │   ├── LeashHitch.java
    │   ├── LightningStrike.java
    │   ├── LivingEntity.java
    │   ├── MagmaCube.java
    │   ├── minecart
    │   │   ├── CommandMinecart.java
    │   │   ├── ExplosiveMinecart.java
    │   │   ├── HopperMinecart.java
    │   │   ├── PoweredMinecart.java
    │   │   ├── RideableMinecart.java
    │   │   ├── SpawnerMinecart.java
    │   │   └── StorageMinecart.java
    │   ├── Minecart.java
    │   ├── Monster.java
    │   ├── MushroomCow.java
    │   ├── NPC.java
    │   ├── Ocelot.java
    │   ├── Painting.java
    │   ├── Pig.java
    │   ├── PigZombie.java
    │   ├── Player.java
    │   ├── PoweredMinecart.java
    │   ├── Projectile.java
    │   ├── Rabbit.java
    │   ├── Sheep.java
    │   ├── Silverfish.java
    │   ├── Skeleton.java
    │   ├── Slime.java
    │   ├── SmallFireball.java
    │   ├── Snowball.java
    │   ├── Snowman.java
    │   ├── Spider.java
    │   ├── Squid.java
    │   ├── StorageMinecart.java
    │   ├── Tameable.java
    │   ├── ThrownExpBottle.java
    │   ├── ThrownPotion.java
    │   ├── TNTPrimed.java
    │   ├── Vehicle.java
    │   ├── Villager.java
    │   ├── WaterMob.java
    │   ├── Weather.java
    │   ├── Witch.java
    │   ├── Wither.java
    │   ├── WitherSkull.java
    │   ├── Wolf.java
    │   └── Zombie.java
    ├── EntityEffect.java
    ├── event
    │   ├── block
    │   │   ├── Action.java
    │   │   ├── BlockBreakEvent.java
    │   │   ├── BlockBurnEvent.java
    │   │   ├── BlockCanBuildEvent.java
    │   │   ├── BlockDamageEvent.java
    │   │   ├── BlockDispenseEvent.java
    │   │   ├── BlockEvent.java
    │   │   ├── BlockExpEvent.java
    │   │   ├── BlockFadeEvent.java
    │   │   ├── BlockFormEvent.java
    │   │   ├── BlockFromToEvent.java
    │   │   ├── BlockGrowEvent.java
    │   │   ├── BlockIgniteEvent.java
    │   │   ├── BlockMultiPlaceEvent.java
    │   │   ├── BlockPhysicsEvent.java
    │   │   ├── BlockPistonEvent.java
    │   │   ├── BlockPistonExtendEvent.java
    │   │   ├── BlockPistonRetractEvent.java
    │   │   ├── BlockPlaceEvent.java
    │   │   ├── BlockRedstoneEvent.java
    │   │   ├── BlockSpreadEvent.java
    │   │   ├── EntityBlockFormEvent.java
    │   │   ├── LeavesDecayEvent.java
    │   │   ├── NotePlayEvent.java
    │   │   └── SignChangeEvent.java
    │   ├── Cancellable.java
    │   ├── enchantment
    │   │   ├── EnchantItemEvent.java
    │   │   └── PrepareItemEnchantEvent.java
    │   ├── entity
    │   │   ├── CreatureSpawnEvent.java
    │   │   ├── CreeperPowerEvent.java
    │   │   ├── EntityBreakDoorEvent.java
    │   │   ├── EntityChangeBlockEvent.java
    │   │   ├── EntityCombustByBlockEvent.java
    │   │   ├── EntityCombustByEntityEvent.java
    │   │   ├── EntityCombustEvent.java
    │   │   ├── EntityCreatePortalEvent.java
    │   │   ├── EntityDamageByBlockEvent.java
    │   │   ├── EntityDamageByEntityEvent.java
    │   │   ├── EntityDamageEvent.java
    │   │   ├── EntityDeathEvent.java
    │   │   ├── EntityEvent.java
    │   │   ├── EntityExplodeEvent.java
    │   │   ├── EntityInteractEvent.java
    │   │   ├── EntityPortalEnterEvent.java
    │   │   ├── EntityPortalEvent.java
    │   │   ├── EntityPortalExitEvent.java
    │   │   ├── EntityRegainHealthEvent.java
    │   │   ├── EntityShootBowEvent.java
    │   │   ├── EntityTameEvent.java
    │   │   ├── EntityTargetEvent.java
    │   │   ├── EntityTargetLivingEntityEvent.java
    │   │   ├── EntityTeleportEvent.java
    │   │   ├── EntityUnleashEvent.java
    │   │   ├── ExpBottleEvent.java
    │   │   ├── ExplosionPrimeEvent.java
    │   │   ├── FoodLevelChangeEvent.java
    │   │   ├── HorseJumpEvent.java
    │   │   ├── ItemDespawnEvent.java
    │   │   ├── ItemSpawnEvent.java
    │   │   ├── PigZapEvent.java
    │   │   ├── PlayerDeathEvent.java
    │   │   ├── PlayerLeashEntityEvent.java
    │   │   ├── PotionSplashEvent.java
    │   │   ├── ProjectileHitEvent.java
    │   │   ├── ProjectileLaunchEvent.java
    │   │   ├── SheepDyeWoolEvent.java
    │   │   ├── SheepRegrowWoolEvent.java
    │   │   └── SlimeSplitEvent.java
    │   ├── EventException.java
    │   ├── EventHandler.java
    │   ├── Event.java
    │   ├── EventPriority.java
    │   ├── HandlerList.java
    │   ├── hanging
    │   │   ├── HangingBreakByEntityEvent.java
    │   │   ├── HangingBreakEvent.java
    │   │   ├── HangingEvent.java
    │   │   └── HangingPlaceEvent.java
    │   ├── inventory
    │   │   ├── BrewEvent.java
    │   │   ├── ClickType.java
    │   │   ├── CraftItemEvent.java
    │   │   ├── DragType.java
    │   │   ├── FurnaceBurnEvent.java
    │   │   ├── FurnaceExtractEvent.java
    │   │   ├── FurnaceSmeltEvent.java
    │   │   ├── InventoryAction.java
    │   │   ├── InventoryClickEvent.java
    │   │   ├── InventoryCloseEvent.java
    │   │   ├── InventoryCreativeEvent.java
    │   │   ├── InventoryDragEvent.java
    │   │   ├── InventoryEvent.java
    │   │   ├── InventoryInteractEvent.java
    │   │   ├── InventoryMoveItemEvent.java
    │   │   ├── InventoryOpenEvent.java
    │   │   ├── InventoryPickupItemEvent.java
    │   │   ├── InventoryType.java
    │   │   └── PrepareItemCraftEvent.java
    │   ├── Listener.java
    │   ├── painting
    │   │   ├── PaintingBreakByEntityEvent.java
    │   │   ├── PaintingBreakEvent.java
    │   │   ├── PaintingEvent.java
    │   │   └── PaintingPlaceEvent.java
    │   ├── player
    │   │   ├── AsyncPlayerChatEvent.java
    │   │   ├── AsyncPlayerPreLoginEvent.java
    │   │   ├── PlayerAchievementAwardedEvent.java
    │   │   ├── PlayerAnimationEvent.java
    │   │   ├── PlayerAnimationType.java
    │   │   ├── PlayerBedEnterEvent.java
    │   │   ├── PlayerBedLeaveEvent.java
    │   │   ├── PlayerBucketEmptyEvent.java
    │   │   ├── PlayerBucketEvent.java
    │   │   ├── PlayerBucketFillEvent.java
    │   │   ├── PlayerChangedWorldEvent.java
    │   │   ├── PlayerChannelEvent.java
    │   │   ├── PlayerChatEvent.java
    │   │   ├── PlayerChatTabCompleteEvent.java
    │   │   ├── PlayerCommandPreprocessEvent.java
    │   │   ├── PlayerDropItemEvent.java
    │   │   ├── PlayerEditBookEvent.java
    │   │   ├── PlayerEggThrowEvent.java
    │   │   ├── PlayerEvent.java
    │   │   ├── PlayerExpChangeEvent.java
    │   │   ├── PlayerFishEvent.java
    │   │   ├── PlayerGameModeChangeEvent.java
    │   │   ├── PlayerInteractAtEntityEvent.java
    │   │   ├── PlayerInteractEntityEvent.java
    │   │   ├── PlayerInteractEvent.java
    │   │   ├── PlayerInventoryEvent.java
    │   │   ├── PlayerItemBreakEvent.java
    │   │   ├── PlayerItemConsumeEvent.java
    │   │   ├── PlayerItemHeldEvent.java
    │   │   ├── PlayerJoinEvent.java
    │   │   ├── PlayerKickEvent.java
    │   │   ├── PlayerLevelChangeEvent.java
    │   │   ├── PlayerLoginEvent.java
    │   │   ├── PlayerMoveEvent.java
    │   │   ├── PlayerPickupItemEvent.java
    │   │   ├── PlayerPortalEvent.java
    │   │   ├── PlayerPreLoginEvent.java
    │   │   ├── PlayerQuitEvent.java
    │   │   ├── PlayerRegisterChannelEvent.java
    │   │   ├── PlayerRespawnEvent.java
    │   │   ├── PlayerShearEntityEvent.java
    │   │   ├── PlayerStatisticIncrementEvent.java
    │   │   ├── PlayerTeleportEvent.java
    │   │   ├── PlayerToggleFlightEvent.java
    │   │   ├── PlayerToggleSneakEvent.java
    │   │   ├── PlayerToggleSprintEvent.java
    │   │   ├── PlayerUnleashEntityEvent.java
    │   │   ├── PlayerUnregisterChannelEvent.java
    │   │   └── PlayerVelocityEvent.java
    │   ├── server
    │   │   ├── MapInitializeEvent.java
    │   │   ├── PluginDisableEvent.java
    │   │   ├── PluginEnableEvent.java
    │   │   ├── PluginEvent.java
    │   │   ├── RemoteServerCommandEvent.java
    │   │   ├── ServerCommandEvent.java
    │   │   ├── ServerEvent.java
    │   │   ├── ServerListPingEvent.java
    │   │   ├── ServiceEvent.java
    │   │   ├── ServiceRegisterEvent.java
    │   │   └── ServiceUnregisterEvent.java
    │   ├── vehicle
    │   │   ├── VehicleBlockCollisionEvent.java
    │   │   ├── VehicleCollisionEvent.java
    │   │   ├── VehicleCreateEvent.java
    │   │   ├── VehicleDamageEvent.java
    │   │   ├── VehicleDestroyEvent.java
    │   │   ├── VehicleEnterEvent.java
    │   │   ├── VehicleEntityCollisionEvent.java
    │   │   ├── VehicleEvent.java
    │   │   ├── VehicleExitEvent.java
    │   │   ├── VehicleMoveEvent.java
    │   │   └── VehicleUpdateEvent.java
    │   ├── weather
    │   │   ├── LightningStrikeEvent.java
    │   │   ├── ThunderChangeEvent.java
    │   │   ├── WeatherChangeEvent.java
    │   │   └── WeatherEvent.java
    │   └── world
    │       ├── ChunkEvent.java
    │       ├── ChunkLoadEvent.java
    │       ├── ChunkPopulateEvent.java
    │       ├── ChunkUnloadEvent.java
    │       ├── PortalCreateEvent.java
    │       ├── SpawnChangeEvent.java
    │       ├── StructureGrowEvent.java
    │       ├── WorldEvent.java
    │       ├── WorldInitEvent.java
    │       ├── WorldLoadEvent.java
    │       ├── WorldSaveEvent.java
    │       └── WorldUnloadEvent.java
    ├── FireworkEffect.java
    ├── GameMode.java
    ├── generator
    │   ├── BlockPopulator.java
    │   └── ChunkGenerator.java
    ├── GrassSpecies.java
    ├── help
    │   ├── GenericCommandHelpTopic.java
    │   ├── HelpMap.java
    │   ├── HelpTopicComparator.java
    │   ├── HelpTopicFactory.java
    │   ├── HelpTopic.java
    │   └── IndexHelpTopic.java
    ├── Instrument.java
    ├── inventory
    │   ├── AnvilInventory.java
    │   ├── BeaconInventory.java
    │   ├── BrewerInventory.java
    │   ├── CraftingInventory.java
    │   ├── DoubleChestInventory.java
    │   ├── EnchantingInventory.java
    │   ├── EntityEquipment.java
    │   ├── FurnaceInventory.java
    │   ├── FurnaceRecipe.java
    │   ├── HorseInventory.java
    │   ├── InventoryHolder.java
    │   ├── Inventory.java
    │   ├── InventoryView.java
    │   ├── ItemFactory.java
    │   ├── ItemStack.java
    │   ├── MerchantInventory.java
    │   ├── meta
    │   │   ├── BannerMeta.java
    │   │   ├── BookMeta.java
    │   │   ├── EnchantmentStorageMeta.java
    │   │   ├── FireworkEffectMeta.java
    │   │   ├── FireworkMeta.java
    │   │   ├── ItemMeta.java
    │   │   ├── LeatherArmorMeta.java
    │   │   ├── MapMeta.java
    │   │   ├── PotionMeta.java
    │   │   ├── Repairable.java
    │   │   └── SkullMeta.java
    │   ├── PlayerInventory.java
    │   ├── Recipe.java
    │   ├── ShapedRecipe.java
    │   └── ShapelessRecipe.java
    ├── Location.java
    ├── map
    │   ├── MapCanvas.java
    │   ├── MapCursorCollection.java
    │   ├── MapCursor.java
    │   ├── MapFont.java
    │   ├── MapPalette.java
    │   ├── MapRenderer.java
    │   ├── MapView.java
    │   └── MinecraftFont.java
    ├── material
    │   ├── Attachable.java
    │   ├── Banner.java
    │   ├── Bed.java
    │   ├── Button.java
    │   ├── Cake.java
    │   ├── Cauldron.java
    │   ├── Chest.java
    │   ├── Coal.java
    │   ├── CocoaPlant.java
    │   ├── Colorable.java
    │   ├── Command.java
    │   ├── Crops.java
    │   ├── DetectorRail.java
    │   ├── Diode.java
    │   ├── DirectionalContainer.java
    │   ├── Directional.java
    │   ├── Dispenser.java
    │   ├── Door.java
    │   ├── Dye.java
    │   ├── EnderChest.java
    │   ├── ExtendedRails.java
    │   ├── FlowerPot.java
    │   ├── FurnaceAndDispenser.java
    │   ├── Furnace.java
    │   ├── Gate.java
    │   ├── Ladder.java
    │   ├── Leaves.java
    │   ├── Lever.java
    │   ├── LongGrass.java
    │   ├── MaterialData.java
    │   ├── MonsterEggs.java
    │   ├── Mushroom.java
    │   ├── NetherWarts.java
    │   ├── Openable.java
    │   ├── PistonBaseMaterial.java
    │   ├── PistonExtensionMaterial.java
    │   ├── PoweredRail.java
    │   ├── PressurePlate.java
    │   ├── PressureSensor.java
    │   ├── Pumpkin.java
    │   ├── Rails.java
    │   ├── Redstone.java
    │   ├── RedstoneTorch.java
    │   ├── RedstoneWire.java
    │   ├── Sandstone.java
    │   ├── Sign.java
    │   ├── SimpleAttachableMaterialData.java
    │   ├── Skull.java
    │   ├── SmoothBrick.java
    │   ├── SpawnEgg.java
    │   ├── Stairs.java
    │   ├── Step.java
    │   ├── TexturedMaterial.java
    │   ├── Torch.java
    │   ├── TrapDoor.java
    │   ├── Tree.java
    │   ├── TripwireHook.java
    │   ├── Tripwire.java
    │   ├── Vine.java
    │   ├── WoodenStep.java
    │   └── Wool.java
    ├── Material.java
    ├── metadata
    │   ├── FixedMetadataValue.java
    │   ├── LazyMetadataValue.java
    │   ├── Metadatable.java
    │   ├── MetadataConversionException.java
    │   ├── MetadataEvaluationException.java
    │   ├── MetadataStoreBase.java
    │   ├── MetadataStore.java
    │   ├── MetadataValueAdapter.java
    │   └── MetadataValue.java
    ├── NetherWartsState.java
    ├── Note.java
    ├── OfflinePlayer.java
    ├── permissions
    │   ├── PermissibleBase.java
    │   ├── Permissible.java
    │   ├── PermissionAttachmentInfo.java
    │   ├── PermissionAttachment.java
    │   ├── PermissionDefault.java
    │   ├── Permission.java
    │   ├── PermissionRemovedExecutor.java
    │   └── ServerOperator.java
    ├── plugin
    │   ├── AuthorNagException.java
    │   ├── EventExecutor.java
    │   ├── IllegalPluginAccessException.java
    │   ├── InvalidDescriptionException.java
    │   ├── InvalidPluginException.java
    │   ├── java
    │   │   ├── JavaPlugin.java
    │   │   ├── JavaPluginLoader.java
    │   │   └── PluginClassLoader.java
    │   ├── messaging
    │   │   ├── ChannelNameTooLongException.java
    │   │   ├── ChannelNotRegisteredException.java
    │   │   ├── MessageTooLargeException.java
    │   │   ├── Messenger.java
    │   │   ├── PluginChannelDirection.java
    │   │   ├── PluginMessageListener.java
    │   │   ├── PluginMessageListenerRegistration.java
    │   │   ├── PluginMessageRecipient.java
    │   │   ├── ReservedChannelException.java
    │   │   └── StandardMessenger.java
    │   ├── PluginAwareness.java
    │   ├── PluginBase.java
    │   ├── PluginDescriptionFile.java
    │   ├── Plugin.java
    │   ├── PluginLoader.java
    │   ├── PluginLoadOrder.java
    │   ├── PluginLogger.java
    │   ├── PluginManager.java
    │   ├── RegisteredListener.java
    │   ├── RegisteredServiceProvider.java
    │   ├── ServicePriority.java
    │   ├── ServicesManager.java
    │   ├── SimplePluginManager.java
    │   ├── SimpleServicesManager.java
    │   ├── TimedRegisteredListener.java
    │   └── UnknownDependencyException.java
    ├── PortalType.java
    ├── potion
    │   ├── PotionBrewer.java
    │   ├── PotionEffect.java
    │   ├── PotionEffectType.java
    │   ├── PotionEffectTypeWrapper.java
    │   ├── Potion.java
    │   └── PotionType.java
    ├── projectiles
    │   ├── BlockProjectileSource.java
    │   └── ProjectileSource.java
    ├── Rotation.java
    ├── SandstoneType.java
    ├── scheduler
    │   ├── BukkitRunnable.java
    │   ├── BukkitScheduler.java
    │   ├── BukkitTask.java
    │   └── BukkitWorker.java
    ├── scoreboard
    │   ├── Criterias.java
    │   ├── DisplaySlot.java
    │   ├── NameTagVisibility.java
    │   ├── Objective.java
    │   ├── Scoreboard.java
    │   ├── ScoreboardManager.java
    │   ├── Score.java
    │   └── Team.java
    ├── Server.java
    ├── SkullType.java
    ├── Sound.java
    ├── Statistic.java
    ├── TravelAgent.java
    ├── TreeSpecies.java
    ├── TreeType.java
    ├── UnsafeValues.java
    ├── util
    │   ├── BlockIterator.java
    │   ├── BlockVector.java
    │   ├── CachedServerIcon.java
    │   ├── ChatPaginator.java
    │   ├── EulerAngle.java
    │   ├── FileUtil.java
    │   ├── io
    │   │   ├── BukkitObjectInputStream.java
    │   │   ├── BukkitObjectOutputStream.java
    │   │   └── Wrapper.java
    │   ├── Java15Compat.java
    │   ├── noise
    │   │   ├── NoiseGenerator.java
    │   │   ├── OctaveGenerator.java
    │   │   ├── PerlinNoiseGenerator.java
    │   │   ├── PerlinOctaveGenerator.java
    │   │   ├── SimplexNoiseGenerator.java
    │   │   └── SimplexOctaveGenerator.java
    │   ├── NumberConversions.java
    │   ├── permissions
    │   │   ├── BroadcastPermissions.java
    │   │   ├── CommandPermissions.java
    │   │   └── DefaultPermissions.java
    │   ├── StringUtil.java
    │   └── Vector.java
    ├── Utility.java
    ├── Warning.java
    ├── WeatherType.java
    ├── WorldBorder.java
    ├── WorldCreator.java
    ├── World.java
    └── WorldType.java
    
    42 个目录, 656 个文件
翻译规范
--------
首先在[README.md](README.md)中加入自己的………………



