// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.

import { InputType } from "./input-type.js";

export interface HttpResponseHeader {
  Name: string;
  NameInResponse: string;
  Summary: string;
  Doc: string;
  Type: InputType;
}
