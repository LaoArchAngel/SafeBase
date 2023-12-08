SafeBase 2.1

Mod ID: 3107853072

An easy-to-craft, almost transparent force field to protect your base ! Number per tribe configurable !

☢ Warning
Please be aware, this is a fork of LaoArchAngel's fantastic SafeBase Mod for Ark! Louis Bang Bang as fixed a newly introduced bug (by ark itself / januar 2021) This mod will seamless replace the origin mod.

[url=https://github.com/Olrik-WP/SafeBase] Code Source 2.1 [/url]

★ Version 2.2 - 08/12/2023

Feature request (Add some decay features) 
if you find that it's too convenient not to use fuel and you want the players to use resources this is the best solution which can be activated or not in the ini
Add tow option in the INI:

UseFuel=1 
FuelConsumptionMultiplier=600.0 
with 600.0 Multiplier at shield radius 10x it consume 1 ressource of wood in 1 minute
If you set UseFuel=1 you need to put wood in the inventory of the shield

★ Version 2.1 - 07/12/2023

Correction of the shield which lights up with an opacity of 0, now at 0.8 by default
Fixed crash when opening the opacity window
Graphically reworked opacity window
Section Removed in INI and not used in 2.1 version:

MinOpacity=0.50
MaxOpacity=0.80
No sense in keeping it configurable in the INI. Variables as set in the code to 0.1 / 1.0, users don't need to worry about it

✪ Steam Workshop
✘ Origin:
 http://steamcommunity.com/sharedfiles/filedetails/?id=1235049753
✘ 2.0 Updated by Louis Bang Bang:
 https://steamcommunity.com/sharedfiles/filedetails/?id=2386532930
✔ Current 2.1 Updated by Deltawp:
 https://steamcommunity.com/sharedfiles/filedetails/?id=3107853072

☄ What It Does
Adds a new engram for a modified Tek Shield that is immune to damage, does not require tek engrams, and does not burn fuel. This is perfect for PvP servers that want to allow tribes to have a small base that is completely protected.

☛ Features
Clean and completely stackable.
Shield max size is configurable. Default max size is the same as a tek shield.
Configurable limit on number of shields per tribe. Default is one.
Shield opacity is adjustable to 0.1 at 1.0 This means it won't look horrible in dark places, like the Aberration map.
The shield ignores babies ! Baby dinos will no longer be thrust out into oblivion.
Does not require access to tek.
Does not require fuel.

☠ Known Bugs
A Dino with massive damage (mostly from a mod like ARK Primal Fear) can bite through the shield. Solution: Don't use this kind of mod or atleast do not put the dino on the border of the shield. Will be not fixed!
Rockdrages can bug through the shield (its the same bug what can happen with the tek shield). Can not be fixed!

➤ Configuration

ShieldSizeMult
Float
Multiplies the default tek shield size by this number.
Default is 1.0.

TribeLimit
Integer
Number of shields a tribe is allowed to have.
Default is 1.

UseFuel
Integer
shields use fuel or not (wood used as fuel)
Default is 0

FuelConsumptionMultiplier
Float
Only used if UseFuel is set to 1
Default is 600.0
With 600.0 Multiplier at shield radius 10x it consume 1 ressource of wood in 1 minute


✔GameUserSettings.ini

[SafeBase]
ShieldSizeMult=1.0
TribeLimit=1
UseFuel=1
FuelConsumptionMultiplier=600.0


☺ Item Class

SB_PrimalItemStructure_Shield_C

##### Engram Class
SB_EngramEntry_Shield_C

##### Spawn Code
cheat giveitem "Blueprint'/Game/Mods/SafeBase/Items/SB_PrimalItemStructure_Shield.SB_PrimalItemStructure_Shield'" 1 1 0

##### Engram Override
OverrideNamedEngramEntries=(EngramClassName="SB_EngramEntry_Shield_C",EngramLevelRequirement=0,EngramPointsCost=0,EngramHidden=False,RemoveEngramPreReq=False)

##### Crafting Cost Override
ConfigOverrideItemCraftingCosts=(ItemClassString="SB_PrimalItemStructure_Shield_C",BaseCraftingResourceRequirements=((ResourceItemTypeString="PrimalItemResource_Thatch_C",BaseResourceRequirement=1.0,bCraftingRequireExactResourceType=True)))

##### Auto Unlock
EngramEntryAutoUnlocks=(EngramClassName="B_EngramEntry_Shield_C",LevelToAutoUnlock=0)

