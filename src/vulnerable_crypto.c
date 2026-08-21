#include <openssl/sha.h>
#include <openssl/rsa.h>
#include <openssl/ec.h>
#include <openssl/bn.h>
#include <openssl/rand.h>
#include <stdio.h>
#include <string.h>

void strong_hash(const unsigned char *msg, size_t len) {
    SHA256_CTX sha256;
    unsigned char sha256_out[SHA256_DIGEST_LENGTH];

    SHA256_Init(&sha256);
    SHA256_Update(&sha256, msg, len);
    SHA256_Final(sha256_out, &sha256);

    /* MD5 -> SHA-256
       SHA-1 -> SHA-256 */
}

void strong_random(void) {
    unsigned char random_bytes[32];

    if (RAND_bytes(random_bytes, sizeof(random_bytes)) != 1) {
        fprintf(stderr, "RAND_bytes failed\n");
        return;
    }
}

void strong_public_key(void) {
    RSA *rsa = RSA_new();
    BIGNUM *e = BN_new();

    BN_set_word(e, RSA_F4);

    /* RSA 1024-bit -> RSA 2048-bit */
    RSA_generate_key_ex(rsa, 2048, e, NULL);

    BN_free(e);
    RSA_free(rsa);

    EC_KEY *ec = EC_KEY_new_by_curve_name(NID_X9_62_prime256v1);
    EC_KEY_free(ec);
}

int main(void) {
    const unsigned char msg[] = "crypto policy test";

    strong_hash(msg, strlen((const char *)msg));
    strong_random();
    strong_public_key();

    printf("This file uses stronger crypto primitives.\n");
    return 0;
}
