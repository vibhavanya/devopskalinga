variable "key_name" {
  default = "oregon1"
}

variable "pvt_key" {
  default = "/root/.ssh/inkey.pem"
}

variable "us-east-zones" {
  default = ["us-east-1a", "us-east-1b"]
}

variable "sg-id" {
  default = "sg-03ac9f8eb19fb3bd6"
}
