import { WebPlugin } from '@capacitor/core';

import type { PersonalNotificationPluginPlugin } from './definitions';

export class PersonalNotificationPluginWeb extends WebPlugin implements PersonalNotificationPluginPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
