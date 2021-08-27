export interface PersonalNotificationPluginPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
